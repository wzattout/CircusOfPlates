package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Plate;
import eg.edu.alexu.csd.oop.game.model.utils.Score;
import eg.edu.alexu.csd.oop.game.model.utils.ShapeFactory;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.Difficulty;

import java.util.Iterator;
import java.util.Random;

public class ArcadeMode implements Mode {

    private long timeElapsed;
    private int remainingLives = 3;
    private long startTime = System.currentTimeMillis();
    private Difficulty difficulty;
    private ShapeFactory factory = new ShapeFactory();
    private long lastTimeShapeCreated = 0;

    public ArcadeMode(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public boolean refresh() {
        timeElapsed = System.currentTimeMillis() - startTime;
        if (Math.random() < difficulty.getShapeProbability() && System.currentTimeMillis() - lastTimeShapeCreated > 1000) {
            lastTimeShapeCreated = System.currentTimeMillis();
            difficulty.addMovableObjects(factory.createShape((int) (Math.random() * difficulty.getShapeCount()), new Random().nextBoolean()));
        }
        Iterator<GameObject> iterator = difficulty.getMovableObjects().iterator();
        while (iterator.hasNext()) {
            GameObject temp = iterator.next();
            Plate plate = null;
            if (temp instanceof Plate)
                plate = (Plate) temp;
            plate.move(plate.getX() > 440 && plate.getX() < 900, plate.isRight());
        }

        return remainingLives > 0;
    }

    @Override
    public String getStatus() {
        return "Score: " + Score.getInstance().getScore() + " Time Elapsed: " + timeElapsed / 1000 + " Remaining Lives: " + remainingLives;
    }

    @Override
    public Difficulty getDifficulty() {
        return difficulty;
    }
}
