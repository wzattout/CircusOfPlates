package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.*;

import java.util.ArrayList;
import java.util.List;

public class EasyDifficulty implements Difficulty {

    @Override
    public List<GameObject> getConstantObjects() {
        ArrayList<GameObject> constantObjects = new ArrayList<>();
        constantObjects.add(new Background(0, 0));
        constantObjects.add(new ConveyorBelt(-30, 100));
        constantObjects.add(new ConveyorBelt(1400 - 470 + 30, 100));
        return constantObjects;
    }

    @Override
    public List<GameObject> getMovableObjects() {
        return null;
    }

    @Override
    public int getSpeed() {return 10;
    }

    @Override
    public int getControlSpeed() {
        return 10;
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
