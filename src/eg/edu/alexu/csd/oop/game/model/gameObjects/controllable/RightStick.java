package eg.edu.alexu.csd.oop.game.model.gameObjects.controllable;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class RightStick extends GameObjectImpl {

    ClownObject clown;

    public RightStick(int x, int y, ClownObject clown) {
        super(x, y, new String[]{"/right_stick.png"});
        this.visible = true;
        this.clown = clown;
    }

    @Override
    public void setY(int y) {}

    public void setX(int x){
        this.x = clown.getX() + 115;
    }
}
