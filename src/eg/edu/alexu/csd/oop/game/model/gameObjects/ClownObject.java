package eg.edu.alexu.csd.oop.game.model.gameObjects;

public class ClownObject extends GameObjectImpl {

    public ClownObject(int x, int y) {
        super(x, y, new String[] {"/clown.png"});
        this.visible = true;
        this.width = getSpriteImages()[0].getHeight();
        this.height = getSpriteImages()[0].getWidth();
    }

    @Override
    public void setY(int y) {}
}
