package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Plate extends ShapeObject implements Shape {

    private boolean isRight;

    public Plate(boolean right, String color) {
        super(right ? 1390 : 0, 88, new String[]{"/plate_" + color + ".png"});
        this.visible = true;
        this.height = getSpriteImages()[0].getHeight();
        this.width = getSpriteImages()[0].getWidth();
        this.isRight = right;
    }

    @Override
    public boolean isRight() {
        return this.isRight;
    }

    @Override
    public void move(boolean falling, boolean right) {
        if (falling) {
            this.setY(this.getY() + 1);
            return;
        }
        if (right) {
            this.setX(this.getX() - 1);
            return;
        }
        this.setX(this.getX() + 1);
    }
}