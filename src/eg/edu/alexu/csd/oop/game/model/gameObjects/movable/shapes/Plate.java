package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Plate extends ShapeObject {

    public Plate(boolean right, boolean top, String color) {
        super(right ? 1340 : 0, top ? 38 : 200 - 12, new String[]{"/plate_" + color + ".png"});
        this.color = color;
        this.isRight = right;
    }
}