package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;
import eg.edu.alexu.csd.oop.game.model.utils.ShapeFactory;
import eg.edu.alexu.csd.oop.game.model.utils.score.Score;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.Difficulty;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArcadeMode implements Mode {

    private long timeElapsed;
    private int remainingLives = 3;
    private long startTime = System.currentTimeMillis();
    private Difficulty difficulty;
    private ShapeFactory factory;
    private long lastTimeShapeCreated = 0;
    private List<GameObject> intersectedObjects;

    public ArcadeMode(Difficulty difficulty) {
        this.difficulty = difficulty;
        factory = new ShapeFactory(difficulty.getColors());
        intersectedObjects = difficulty.getConstantObjects();
        intersectedObjects.addAll(difficulty.getControllableObjects());
    }

    @Override
    public boolean refresh() {
        timeElapsed = System.currentTimeMillis() - startTime;
        if (Math.random() < difficulty.getShapeProbability() && System.currentTimeMillis() - lastTimeShapeCreated > 1000) {
            lastTimeShapeCreated = System.currentTimeMillis();
            difficulty.setMovableObjects(factory.createShape((int) (Math.random() * difficulty.getShapeCount()), difficulty.getConveyorPosition(), new Random().nextBoolean()));
        }
        Iterator<GameObject> iterator = difficulty.getMovableObjects().iterator();
        while (iterator.hasNext()) {
            GameObject temp = iterator.next();
            ShapeObject shape;
            if (temp instanceof ShapeObject) {
                shape = (ShapeObject) temp;
                if(shape.getState().actUponState(intersectedObjects, difficulty.getSpeed()))
                    iterator.remove();
            }
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
