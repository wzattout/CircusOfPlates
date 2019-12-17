package eg.edu.alexu.csd.oop.game.model.gameObjects.constant;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class Background extends GameObjectImpl {

    public Background(int x, int y) {
        super(x, y, new String[]{"C:\\Users\\dell\\Documents\\70_circus_of_plates\\res\\circus_background.png"});
        this.visible = true;
    }
}
