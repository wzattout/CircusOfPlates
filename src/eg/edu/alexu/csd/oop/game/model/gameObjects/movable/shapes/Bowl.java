package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Bowl extends ShapeObject {

    public Bowl(boolean right, String color) {
        super(right ? 1400 : 0, 12, new String[]{"/bowl_" + color + ".png"});
        this.isRight = right;
    }

    @Override
    public void move(boolean falling, boolean right, int speed) {
        if (falling) {
            this.setY(this.getY() + 2 * speed);
            return;
        }
        if (right) {
            this.setX(this.getX() - speed);
            return;
        }
        this.setX(this.getX() + speed);
    }
}
