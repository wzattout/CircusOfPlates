package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies;

import eg.edu.alexu.csd.oop.game.model.gameObjects.Score;

public class TimedMode implements Mode {

    int timeLeft = 0;

    @Override
    public boolean refresh() {
        return true;
    }

    @Override
    public String getStatus() {
        return "Score: " + Score.getInstance().getScore() + " Time Left: " + timeLeft;
    }
}
