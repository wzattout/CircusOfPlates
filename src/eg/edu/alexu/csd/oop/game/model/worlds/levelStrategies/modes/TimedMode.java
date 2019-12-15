package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.model.utils.Score;

public class TimedMode implements Mode {

    private long timeLeft;
    private long startTime = System.currentTimeMillis();

    @Override
    public boolean refresh() {
        timeLeft = 60000 - (System.currentTimeMillis() - startTime);
        // Should be called every time a plate is added to the stack but leave it here for now.
        Score.getInstance().getScoreNotifier().checkStack("let this be empty for now");
        return timeLeft > 0;
    }

    @Override
    public String getStatus() {
        return "Score: " + Score.getInstance().getScore() + " Time Left: " + Math.max(0, timeLeft)/1000;
    }
}
