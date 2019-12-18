package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.Background;
import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.ConveyorBelt;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.ArrayList;
import java.util.List;

public class MediumDifficulty implements Difficulty {

    private List<GameObject> movableObjects = new ArrayList<>();

    @Override
    public List<GameObject> getConstantObjects() {
        ArrayList<GameObject> constantObjects = new ArrayList<>();
        constantObjects.add(new Background(0, 0));
        constantObjects.add(new ConveyorBelt(-30, 50));
        constantObjects.add(new ConveyorBelt(960, 50));
        constantObjects.add(new ConveyorBelt(-30, 200));
        constantObjects.add(new ConveyorBelt(960, 200));
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
        return 2;
    }

    @Override
    public int getControlSpeed() {
        return 9;
    }

    @Override
    public double getPowerUpProbability() {
        return 0;
    }

    @Override
    public double getShapeProbability() {
        return 0.05;
    }

    @Override
    public int getGameTime() {
        return 0;
    }

    @Override
    public int getShapeCount() {
        return 2;
    }

    @Override
    public String[] getColors() {
        return new String[]{"red", "yellow", "green", "cyan", "orange"};
    }
}
