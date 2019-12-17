package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Shape3 extends ShapeObject implements Shape {

    private boolean isRight;

    public Shape3(boolean right) {
        super(right ? 1400 : 0, 40, new String[]{"/slow_time.png"});
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
            this.setY(this.getY() + 3);
            return;
        }
        if (right) {
            this.setX(this.getX() - 1);
            return;
        }
        this.setX(this.getX() + 1);
    }
}
