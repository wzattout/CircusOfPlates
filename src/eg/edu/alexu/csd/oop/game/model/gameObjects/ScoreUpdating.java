package eg.edu.alexu.csd.oop.game.model.gameObjects;

//smallest class ever built
public class ScoreUpdating implements Observer{
	private static int current_score = 0;
	
	public void update() {
		current_score++;
	}
	
	
}
