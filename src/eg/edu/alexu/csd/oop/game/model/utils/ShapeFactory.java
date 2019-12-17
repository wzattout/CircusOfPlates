package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Plate;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Shape2;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Shape3;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.Enumeration;

public class ShapeFactory {
    /**********************************singleton design pattern*********************************************
     private static ShapeFactory instance = new ShapeFactory();

     private ShapeFactory() {
     }

     public static ShapeFactory get_instance() {
     return instance;
     }
     ************************************************************************************************/
    String[] colors = new String[]{"red", "green", "yellow"};

    public ShapeObject createShape(int x, boolean right) {
        //if (x == 1) {
        double color = Math.random() * 3;
        return new Plate(right, colors[(int) color]);
        //} else if (x == 2) {
        //    return new Shape2(right);
        //} else if (x == 3) {
        //    return new Shape3(right);
        //}
        // return null;
    }
}
