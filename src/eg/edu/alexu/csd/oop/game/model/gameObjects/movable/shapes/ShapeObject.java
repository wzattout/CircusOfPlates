package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class ShapeObject extends GameObjectImpl {

    public ShapeObject(int x, int y, String[] paths) {
        super(x, y, paths);
    }


    public void move(int x, int y, boolean falling, boolean right) {
        return;
    }
}
