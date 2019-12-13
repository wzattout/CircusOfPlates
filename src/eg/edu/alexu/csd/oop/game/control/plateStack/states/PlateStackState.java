package eg.edu.alexu.csd.oop.game.control.plateStack.states;

import eg.edu.alexu.csd.oop.game.control.plateStack.PlateStack;

public interface PlateStackState {

    boolean incrementScore();

    boolean changeState(String color, PlateStack stack);
}
