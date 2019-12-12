package eg.edu.alexu.csd.oop.game.model.gameObjects;
import java.util.ArrayList;

public class PlateStack extends GameObjectImpl implements Subject {
    
	private ArrayList<Observer> observers = new ArrayList<>();

	public PlateStack(int x, int y, String[] paths) {
		super(x, y, paths);
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
}
