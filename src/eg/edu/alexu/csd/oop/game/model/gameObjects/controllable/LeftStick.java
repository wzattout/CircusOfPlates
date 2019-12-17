package eg.edu.alexu.csd.oop.game.model.gameObjects.controllable;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class LeftStick extends GameObjectImpl {

    ClownObject clown;

    public LeftStick(int x, int y, ClownObject clown) {
        super(x, y, new String[]{System.getProperty("user.dir") + "\\res\\left_stick.png"});
        this.visible = true;
        this.clown = clown;
    }

    @Override
    public void setY(int y) {
    }

    @Override
    public void setX(int x) {
        this.x = clown.getX() - 40;
    }
}
