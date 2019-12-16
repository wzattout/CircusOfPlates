package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Shape1;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Shape2;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Shape3;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

public class ShapeFactory {

    public ShapeObject createShape(int x, boolean right) {
        if (x == 1) {
            return new Shape1(right);
        } else if (x == 2) {
            return new Shape2(right);
        } else if (x == 3) {
            return new Shape3(right);
        }
        return null;
    }
}
