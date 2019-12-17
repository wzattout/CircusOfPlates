package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties;

import eg.edu.alexu.csd.oop.game.GameObject;

import java.util.List;

public class MediumDifficulty implements Difficulty {


    @Override
    public List<GameObject> getConstantObjects() {
        return null;
    }

    @Override
    public List<GameObject> getMovableObjects() {
        return null;
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
    public int getPowerUpProbability() {
        return 0;
    }

    @Override
    public int getGameTime() {
        return 0;
    }
}
