package eg.edu.alexu.csd.oop.game.model.gameObjects;

public interface Subject{

    ArrayList<Obserever> observers = new ArrayList<Observer>(0); 
    
    public void regestir_observer();
    public void remove_observer();
    
    public void notiffy_obserevers();
    
    
}