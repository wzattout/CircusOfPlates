package eg.edu.alexu.csd.oop.game.model.gameObjects;

public interface Subject {

	//adding observer 
	public void register_observer(Observer e);

	//removing observer
    public void remove_observer(Observer e);

    //notify observers when subject changes
    public void notify_observers();
}
