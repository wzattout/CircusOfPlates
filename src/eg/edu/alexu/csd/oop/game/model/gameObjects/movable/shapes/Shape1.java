package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Shape1 extends ShapeObject implements Shape {

    public Shape1(boolean right) {
        super(right ? 0 : 1, 0, new String[]{"shape1path"});
        this.visible = true;
        this.height = getSpriteImages()[0].getWidth();
        this.width = getSpriteImages()[0].getHeight();
    }

    @Override
    public void move(int x, int y, boolean falling, boolean right) {
        if (falling) {
            y--;
            return;
        }
        if (right) {
            x--;
            return;
        }
        x++;
    }
}