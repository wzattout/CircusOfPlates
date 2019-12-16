package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties;

import eg.edu.alexu.csd.oop.game.GameObject;

import java.util.List;

public interface Difficulty {

    int getSpeed();

    int getControlSpeed();

    int getPowerUpProbability();

    List<GameObject> getConstantObjects();

    List<GameObject> getMovableObjects();

    int getGameTime();
}
