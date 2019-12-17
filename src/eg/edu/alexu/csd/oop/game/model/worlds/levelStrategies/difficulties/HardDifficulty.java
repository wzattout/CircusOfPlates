package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.List;

public class HardDifficulty implements Difficulty {

    private List<GameObject> movableObjects;

    @Override
    public List<GameObject> getConstantObjects() {
        return null;
    }

    @Override
    public List<GameObject> getMovableObjects() {
        return null;
    }

    @Override
    public void addMovableObjects(ShapeObject shape) {
        movableObjects.add(shape);
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public int getControlSpeed() {
        return 0;
    }

    @Override
    public double getPowerUpProbability() {
        return 0;
    }

    @Override
    public double getShapeProbability() {
        return 0;
    }

    @Override
    public int getGameTime() {
        return 0;
    }

    @Override
    public int getShapeCount() {
        return 0;
    }
}
