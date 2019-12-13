package eg.edu.alexu.csd.oop.game.model.gameObjects.controllable;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class Stick extends GameObjectImpl {

    public Stick(int x, int y, String path) {
        super(x, y, new String[]{path});
        this.visible = true;
    }

    @Override
    public void setY(int y) {}
}
