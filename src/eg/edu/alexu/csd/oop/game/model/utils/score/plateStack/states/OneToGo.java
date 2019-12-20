package eg.edu.alexu.csd.oop.game.model.utils.score.plateStack.states;

import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;
import eg.edu.alexu.csd.oop.game.model.utils.plateStates.Useless;
import eg.edu.alexu.csd.oop.game.model.utils.score.plateStack.PlateStack;

import java.util.Stack;

public class OneToGo implements PlateStackState {

    private ShapeObject shape;
    private int changeInHeight = 0;

    public OneToGo(ShapeObject shape) {
        this.shape = shape;
    }

    public ShapeObject getShape() {
        return shape;
    }

    @Override
    public int getChangeInHeight() {
        return changeInHeight;
    }

    @Override
    public void setChangeInHeight(int changeInHeight) {
        this.changeInHeight = changeInHeight;
    }

    @Override
    public boolean changeState(ShapeObject shape, PlateStack stack) {
        Stack<PlateStackState> temp = stack.getStateStack();
        if (this.shape != null && shape.getColor().equals(this.shape.getColor())) {
            shape.setState(new Useless());
            changeInHeight = 0;
            temp.peek().getShape().setState(new Useless());
            changeInHeight -= temp.pop().getShape().getHeight();
            temp.peek().getShape().setState(new Useless());
            changeInHeight -= temp.pop().getShape().getHeight();
            temp.peek().setChangeInHeight(changeInHeight);
            stack.setStateStack(temp);
            return true;
        }
        PlateStackState state = new Waiting(shape);
        state.setChangeInHeight(shape.getHeight());
        temp.push(new Waiting(shape));
        stack.setStateStack(temp);
        return false;
    }
}
