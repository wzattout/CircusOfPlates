package eg.edu.alexu.csd.oop.game.model.gameObjects;

public class Background extends GameObjectImpl {

    public Background(int x, int y) {
        super(x, y, new String[]{"/circus_background.png"});
        this.visible = true;
    }
}
