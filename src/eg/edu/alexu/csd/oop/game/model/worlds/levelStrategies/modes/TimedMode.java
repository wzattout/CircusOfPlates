package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.utils.score.Score;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.Difficulty;

public  class TimedMode implements Mode {

    private long timeLeft;
    private int gameTime;
    private long startTime = System.currentTimeMillis();
    private Difficulty difficulty;

    public TimedMode(int gameTime) {
        this.gameTime = gameTime;
    }

    @Override
    public boolean refresh() {
        timeLeft = gameTime - (System.currentTimeMillis() - startTime);
        // Should be called every time a plate is added to the stack but leave it here for now.
        Score.getInstance().getScoreNotifier().checkStack("let this be empty for now");
        return timeLeft > 0;
    }

    @Override
    public String getStatus() {
        return "Score: " + Score.getInstance().getScore() + " Time Left: " + Math.max(0, timeLeft) / 1000;
    }

    @Override
    public void setSticksObjects(GameObject[] sticks) {

    }

    @Override
    public Difficulty getDifficulty() {
        return difficulty;
    }
}
