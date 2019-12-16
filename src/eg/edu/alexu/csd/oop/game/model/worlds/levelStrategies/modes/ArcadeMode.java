package eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes;

import eg.edu.alexu.csd.oop.game.model.utils.Score;

public class ArcadeMode implements Mode {

    private long timeElapsed;
    private int remainingLives = 3;
    private long startTime = System.currentTimeMillis();

    @Override
    public boolean refresh() {
        timeElapsed = System.currentTimeMillis() - startTime;
        return remainingLives > 0;
    }

    @Override
    public String getStatus() {
        return "Score: " + Score.getInstance().getScore() + " Time Elapsed: " + timeElapsed / 1000 + " Remaining Lives: " + remainingLives;
    }
}
