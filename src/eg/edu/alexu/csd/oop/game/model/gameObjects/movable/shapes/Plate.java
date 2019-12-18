package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

import java.util.Random;

public class Plate extends ShapeObject {

    public Plate(boolean right, String color) {
        super(right ? 1340 : 0, Math.random()>.5?38:200, new String[]{"/plate_" + color + ".png"});
        this.isRight = right;
    }

    @Override
    public void move(boolean falling, boolean right, int speed) {
        if (falling) {
            this.setY(this.getY() + speed);
            return;
        }
        if (right) {
            this.setX(this.getX() - speed);
            return;
        }
        this.setX(this.getX() + speed);
    }
}