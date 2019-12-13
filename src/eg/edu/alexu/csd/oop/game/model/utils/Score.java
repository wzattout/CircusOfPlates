package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.control.plateStack.PlateStack;

public class Score implements Observer{

	private int current_score = 0;
	private PlateStack scoreNotifier = new PlateStack();
	private Score(){
		scoreNotifier.register_observer(this);
	}
	private static Score score = null;

	public static Score getInstance(){
		if(score != null)
			return score;
		return new Score();
	}

	public void update() {
		current_score++;
	}
	
	public int getScore(){
		return current_score;
	}
}
