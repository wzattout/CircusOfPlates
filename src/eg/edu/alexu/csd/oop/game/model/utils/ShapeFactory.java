package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Bowl;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Plate;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Vase;

public class ShapeFactory {

    private String[] colors;

    public ShapeFactory(String[] colors) {
        this.colors = colors;
    }

    public ShapeObject createShape(int x, boolean top, boolean right) {
        double color = Math.random() * colors.length;
        switch (x) {
            case 0:
                return new Plate(right, top, colors[(int) color]);
            case 1:
                return new Bowl(right, top, colors[(int) color]);
            case 2:
                return new Vase(right, top, colors[(int) color]);
        }
        return null;
    }
}
