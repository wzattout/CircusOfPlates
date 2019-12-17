package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Shape2 extends ShapeObject implements Shape {

    private boolean isRight;

    public Shape2(boolean right) {
        super(right ? 1400 : 0, 90, new String[]{System.getProperty("user.dir") + "\\res\\plate_red.png"});
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
    public void move(boolean falling, boolean right) {
        if (falling) {
            this.setY(this.getY() + 2);
            return;
        }
        if (right) {
            this.setX(this.getX() - 1);
            return;
        }
        this.setX(this.getX() + 1);
    }
}
