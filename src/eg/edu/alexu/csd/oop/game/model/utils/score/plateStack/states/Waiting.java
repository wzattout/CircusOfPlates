package eg.edu.alexu.csd.oop.game.model.utils.score.plateStack.states;

import eg.edu.alexu.csd.oop.game.model.utils.score.plateStack.PlateStack;

import java.util.Stack;

public class Waiting implements PlateStackState {

    String color;

    public Waiting(String color) {
        this.color = color;
    }

    @Override
    public boolean incrementScore() {
        return false;
    }

    @Override
    public boolean changeState(String color, PlateStack stack) {
        Stack<PlateStackState> temp = stack.getStateStack();
        if (color.equals(this.color))
            temp.push(new OneToGo(color));
        else
            temp.push(new Waiting(color));
        stack.setStateStack(temp);
        return false;
    }
}
