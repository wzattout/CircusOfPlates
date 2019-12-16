package eg.edu.alexu.csd.oop.game.control;

import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.Mode;

public class SnapShot {

    private static Mode mode = null;

    public SnapShot(Mode mode) {
        this.mode = mode;
    }

    public Mode getState() {
        return this.mode;
    }
}
