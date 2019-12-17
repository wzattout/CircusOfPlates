package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public interface Shape {

    void move(int x, int y, boolean falling, boolean right);
    
    boolean isright();
}
