package eg.edu.alexu.csd.oop.game.model.utils.score;

import eg.edu.alexu.csd.oop.game.model.utils.score.plateStack.PlateStack;

public class Score implements Observer {

    private int current_score = 0;
    private PlateStack scoreNotifier = new PlateStack();
    private static Score score = null;

    private Score() {
        scoreNotifier.register_observer(this);
    }

    public static Score getInstance() {
        if (score != null)
            return score;
        return new Score();
    }

    public PlateStack getScoreNotifier() {
        return scoreNotifier;
    }

    public void update() {
        current_score++;
    }

    @Override
    public void update(int x) {

    }

    public int getScore() {
        return current_score;
    }
}
