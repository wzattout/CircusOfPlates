package eg.edu.alexu.csd.oop.game.model.gameObjects;

public class ConveyorBelt extends GameObjectImpl {

    public ConveyorBelt(int x, int y, String path) {
        super(x, y, new String[] {path});
        this.visible = true;
    }
}
