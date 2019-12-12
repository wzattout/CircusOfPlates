package eg.edu.alexu.csd.oop.game.model.gameObjects;
import java.util.ArrayList;

public class Score implements Subject{
    
	private ArrayList<Observer> observers= null;
	
	@Override
	public void regestir_observer(Observer e) {
		observers.add(e);
	}

	@Override
	public void remove_observer(Observer e) {
		observers.remove(e);
	}

	@Override
	public void notiffy_obserevers() {
		for(Observer e : observers) {
			e.update();
		}
	}

}
