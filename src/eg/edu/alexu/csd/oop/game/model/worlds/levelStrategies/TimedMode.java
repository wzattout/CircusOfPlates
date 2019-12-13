package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies;

import eg.edu.alexu.csd.oop.game.model.utils.Score;

public class TimedMode implements Mode {

    private long timeLeft;
    private long startTime = System.currentTimeMillis();

    @Override
    public boolean refresh() {
        timeLeft = 60000 - (System.currentTimeMillis() - startTime);
        return timeLeft > 0;
    }

    @Override
    public String getStatus() {
        return "Score: " + Score.getInstance().getScore() + " Time Left: " + timeLeft;
    }
}
