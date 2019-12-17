package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Shape3 extends ShapeObject implements Shape {

    private boolean isRight;

    public Shape3(boolean right) {
        super(right ? 1400 : 0, 90, new String[]{System.getProperty("user.dir") + "\\res\\plate_yellow.png"});
        this.visible = true;
        this.height = getSpriteImages()[0].getWidth();
        this.width = getSpriteImages()[0].getHeight();
        this.isRight = right;
    }

    @Override
    public boolean isRight() {
        return this.isRight;
    }

    @Override
    public void move(int x, int y, boolean falling, boolean right) {
        if (falling) {
            this.setY(y + 30);
            return;
        }
        if (right) {
            this.setX(x - 10);
            return;
        }
        this.setX(x + 10);
    }
}
