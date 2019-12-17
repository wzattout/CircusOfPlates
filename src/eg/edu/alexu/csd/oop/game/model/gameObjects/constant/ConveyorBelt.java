package eg.edu.alexu.csd.oop.game.model.gameObjects.constant;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class ConveyorBelt extends GameObjectImpl {

    public ConveyorBelt(int x, int y) {
        super(x, y, new String[]{"C:\\Users\\dell\\Documents\\70_circus_of_plates\\res\\conveyor.png"});
        this.visible = true;
    }
}
