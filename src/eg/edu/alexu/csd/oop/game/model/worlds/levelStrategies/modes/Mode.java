package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.Difficulty;

public interface Mode {

    boolean refresh();

    String getStatus();

    Difficulty getDifficulty() throws NullPointerException;
}
