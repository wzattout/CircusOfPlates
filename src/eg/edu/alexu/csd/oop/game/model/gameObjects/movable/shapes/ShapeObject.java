package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public abstract class ShapeObject extends GameObjectImpl {

    protected boolean isRight;

    public ShapeObject(int x, int y, String[] paths) {
        super(x, y, paths);
        this.visible = true;
        this.height = getSpriteImages()[0].getWidth();
        this.width = getSpriteImages()[0].getHeight();
    }

    abstract public void move(boolean falling, boolean right, int speed);

    public boolean isRight() {
        return this.isRight;
    }
}
