package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;

public class ShapesPool {
    /****************************************singleton design pattern*********************************************/
    private static ShapesPool instance = new ShapesPool();

    private ShapesPool() {
    }

    public static ShapesPool get_instance() {
        return instance;
    }

    /************************************************************************************************************/
    private static Hashtable<Integer, ShapeObject> used_shapes = new Hashtable<Integer, ShapeObject>();
    //private static Hashtable<Integer, ShapeObject> unused_shapes = new Hashtable<Integer, ShapeObject>();

    /*public ShapesPool() {
        ShapeFactory createshape = ShapeFactory.get_instance();
        int c = 0;
        for (int i = 0; i < 10; i++) {
            unused_shapes.put(c++, createshape.createShape(1, true));
            unused_shapes.put(c++, createshape.createShape(2, true));
            unused_shapes.put(c++, createshape.createShape(3, true));
            unused_shapes.put(c+  createshape.createShape(2, false));
            unused_shapes.put(c++, createshape.createShape(3, false));
        }
    }*/

    /*public ShapeObject get_shape() {
        Enumeration<Integer> e = used_shapes.keys();
        while (e.hasMoreElements()) {
            int key = e.nextElement();
            if(!used_shapes.get(key).isVisible()) {
                ShapeObject temp = used_shapes.get(key);
                return temp;
            }
        }
        Random r = new Random();
        return ShapeFactory.get_instance().createShape(r.nextInt(3) + 1, r.nextBoolean());
    }*/
}
