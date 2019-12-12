package eg.edu.alexu.csd.oop.game.model.gameObjects;
import java.util.ArrayList;

public class Score implements Subject{
    
	private ArrayList<Observer> observers= null;
	
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

}
