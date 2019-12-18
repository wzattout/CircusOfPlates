package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Bowl;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Plate;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Shape3;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

public class ShapeFactory {

    private String[] colors;

    public ShapeFactory(String[] colors) {
        this.colors = colors;
    }

    public ShapeObject createShape(int x, boolean right) {
        double color = Math.random() * colors.length;
        switch(x) {
            case 0:
                return new Plate(right, colors[(int) color]);
            case 1:
                return new Bowl(right, colors[(int) color]);
            case 2:
                return new Shape3(right);
        }
        return null;
    }
}
