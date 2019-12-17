package eg.edu.alexu.csd.oop.game.model.gameObjects.controllable;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class ClownObject extends GameObjectImpl {

    public ClownObject(int x, int y) {
        super(x, y, new String[]{"C:\\Users\\dell\\Documents\\70_circus_of_plates\\res\\clown.png"});
        this.visible = true;
        this.width = getSpriteImages()[0].getHeight();
        this.height = getSpriteImages()[0].getWidth();
    }

    @Override
    public void setY(int y) {
    }
}
