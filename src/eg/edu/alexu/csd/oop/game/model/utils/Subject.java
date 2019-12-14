package eg.edu.alexu.csd.oop.game.model.utils;

public interface Subject {

	//adding observer 
	void register_observer(Observer e);

	//removing observer
    void remove_observer(Observer e);

    //notify observers when subject changes
    void notify_observers();
}
