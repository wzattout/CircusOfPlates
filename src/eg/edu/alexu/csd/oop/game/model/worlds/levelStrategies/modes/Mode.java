package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.Difficulty;

import java.util.ArrayList;


public interface Mode {

    boolean refresh();

    String getStatus();

    void setSticksObjects(GameObject[] sticks);


    Difficulty getDifficulty();
}
