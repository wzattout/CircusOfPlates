package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.Background;
import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.ConveyorBelt;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.ClownObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.LeftStick;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.RightStick;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.ArrayList;
import java.util.List;

public class EasyDifficulty implements Difficulty {

    private List<GameObject> movableObjects = new ArrayList<>();

    @Override
    public List<GameObject> getControllableObjects() {
        ArrayList<GameObject> controllableObjects = new ArrayList<>();
        ClownObject clown = new ClownObject(625, 475);
        controllableObjects.add(clown);
        GameObject leftStick = new LeftStick(585, 435, clown);
        GameObject rightStick = new RightStick(740, 452, clown);
        controllableObjects.add(leftStick);
        controllableObjects.add(rightStick);
        return controllableObjects;
    }

    @Override
    public List<GameObject> getConstantObjects() {
        ArrayList<GameObject> constantObjects = new ArrayList<>();
        constantObjects.add(new Background(0, 0));
        constantObjects.add(new ConveyorBelt(-30, 50));
        constantObjects.add(new ConveyorBelt(960, 50));
        return constantObjects;
    }

    @Override
    public List<GameObject> getMovableObjects() {
        return movableObjects;
    }

    @Override
    public void setMovableObjects(ShapeObject shape) {
        movableObjects.add(shape);
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getControlSpeed() {
        return 10;
    }

    @Override
    public double getPowerUpProbability() {
        return 0;
    }

    @Override
    public double getShapeProbability() {
        return 0.005;
    }

    @Override
    public int getGameTime() {
        return 0;
    }

    @Override
    public int getShapeCount() {
        return 1;
    }

    public String[] getColors() {
        return new String[]{"red", "yellow", "green"};
    }

    @Override
    public boolean getConveyorPosition() {
        return true;
    }
}
