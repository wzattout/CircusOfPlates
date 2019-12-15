package eg.edu.alexu.csd.oop.game.view;

import eg.edu.alexu.csd.oop.game.GameEngine;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.TimedMode;
import eg.edu.alexu.csd.oop.game.model.worlds.levels.testLevel;

public class Main {
    public static void main(String[] args) {
        GameEngine.GameController gameController = GameEngine.start("Test Run", new testLevel(new TimedMode()));
    }
}
