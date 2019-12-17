package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.List;

public interface Difficulty {

    int getSpeed();

    int getControlSpeed();

    double getPowerUpProbability();

    double getShapeProbability();

    List<GameObject> getConstantObjects();

    List<GameObject> getMovableObjects();

    void addMovableObjects(ShapeObject shape);

    int getGameTime();

    int getShapeCount();
}
