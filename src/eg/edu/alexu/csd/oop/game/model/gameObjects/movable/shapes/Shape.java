package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public interface Shape {

    void move(boolean falling, boolean right);

    boolean isRight();
}
