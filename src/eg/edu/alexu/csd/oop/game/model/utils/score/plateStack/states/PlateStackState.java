package eg.edu.alexu.csd.oop.game.model.utils.score.plateStack.states;

import eg.edu.alexu.csd.oop.game.model.utils.score.plateStack.PlateStack;

public interface PlateStackState {

    boolean incrementScore();

    boolean changeState(String color, PlateStack stack);
}
