package eg.edu.alexu.csd.oop.game.model.gameObjects;

public class Stick extends GameObjectImpl {

    public Stick(int x, int y) {
        super(x, y, new String[]{"/stick.png"});
        this.visible = true;
    }

    @Override
    public void setY(int y) {}
}
