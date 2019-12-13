package eg.edu.alexu.csd.oop.game.control.plateStack.states;

import eg.edu.alexu.csd.oop.game.control.plateStack.PlateStack;

import java.util.Stack;

public class OneToGo implements PlateStackState {

    String color;

    public OneToGo(String color) {
        this.color = color;
    }

    @Override
    public boolean incrementScore() {
        return false;
    }

    @Override
    public boolean changeState(String color, PlateStack stack) {
        Stack<PlateStackState> temp = stack.getStateStack();
        if(color.equals(this.color)) {
            temp.pop();
            temp.pop();
            stack.setStateStack(temp);
            return true;
        }
        temp.push(new Waiting(color));
        stack.setStateStack(temp);
        return false;
    }
}
