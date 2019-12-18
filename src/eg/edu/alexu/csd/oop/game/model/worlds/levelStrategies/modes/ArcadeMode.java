package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Bowl;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Plate;
import eg.edu.alexu.csd.oop.game.model.utils.score.Score;
import eg.edu.alexu.csd.oop.game.model.utils.ShapeFactory;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.Difficulty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArcadeMode implements Mode {

    private GameObject leftStick, rightStick;
    private long timeElapsed;
    private int remainingLives = 3;
    private long startTime = System.currentTimeMillis();
    private Difficulty difficulty;
    private ShapeFactory factory;
    private long lastTimeShapeCreated = 0;

    public ArcadeMode(Difficulty difficulty) {
        this.difficulty = difficulty;
        factory = new ShapeFactory(difficulty.getColors());
    }



    @Override
    public boolean refresh() {
        timeElapsed = System.currentTimeMillis() - startTime;
        if (Math.random() < difficulty.getShapeProbability() && System.currentTimeMillis() - lastTimeShapeCreated > 1000) {
            lastTimeShapeCreated = System.currentTimeMillis();
            difficulty.setMovableObjects(factory.createShape((int) (Math.random() * difficulty.getShapeCount()), new Random().nextBoolean()));
        }
        Iterator<GameObject> iterator = difficulty.getMovableObjects().iterator();
        while (iterator.hasNext()) {
            GameObject temp = iterator.next();
            Plate plate;
            Bowl bowl;
            if(Intersection(temp)){
                System.out.println("yes");
            }
            else if (temp instanceof Plate) {
                plate = (Plate) temp;
                plate.move(plate.getX() > 440 && plate.getX() < 900, plate.isRight(), difficulty.getSpeed());
            } else if (temp instanceof Bowl) {
                bowl = (Bowl) temp;
                bowl.move(bowl.getX() > 440 && bowl.getX() < 900, bowl.isRight(), difficulty.getSpeed());
            }
        }

        return remainingLives > 0;
    }

    @Override
    public String getStatus() {
        return "Score: " + Score.getInstance().getScore() + " Time Elapsed: " + timeElapsed / 1000 + " Remaining Lives: " + remainingLives;
    }

    @Override
    public void setSticksObjects(GameObject[] sticks) {
        leftStick = sticks[0];
        rightStick = sticks[1];
    }


    @Override
    public Difficulty getDifficulty() {
        return difficulty;
    }


    private boolean Intersection(GameObject shape){
        return ((shape.getX()<leftStick.getX()+leftStick.getWidth()/2&&shape.getX()>leftStick.getX()-leftStick.getWidth()/2)||
                (shape.getX()<rightStick.getX()+rightStick.getWidth()/2&&shape.getX()>rightStick.getX()-rightStick.getWidth()/2))&&
                ((shape.getY()+shape.getHeight()/2-leftStick.getY()-leftStick.getHeight()/2<0)||
                        (shape.getY()+shape.getHeight()/2-rightStick.getY()-rightStick.getHeight()/2<0));
    }






}
