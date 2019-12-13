package eg.edu.alexu.csd.oop.game.control.plateStack;

import eg.edu.alexu.csd.oop.game.control.plateStack.states.*;
import eg.edu.alexu.csd.oop.game.model.utils.*;
import java.util.ArrayList;
import java.util.Stack;

public class PlateStack implements Subject {
    
	private ArrayList<Observer> observers = new ArrayList<>();

	public Stack<PlateStackState> getStateStack() {
		return stateStack;
	}

	public void setStateStack(Stack<PlateStackState> stateStack) {
		this.stateStack = stateStack;
	}

	private Stack <PlateStackState> stateStack = new Stack<>();

	public PlateStack(){
		stateStack.push(new Waiting(null));
	}

	@Override
	public void register_observer(Observer e) {
		observers.add(e);
	}

	@Override
	public void remove_observer(Observer e) {
		observers.remove(e);
	}

	@Override
	public void notify_observers() {
		for(Observer e : observers) {
			e.update();
		}
	}

	public void checkStack(String color){
		if(stateStack.peek().changeState(color, this))
			notify_observers();
		System.out.println(stateStack);
	}
}
