package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.ShapeObject;

import java.util.Enumeration;
import java.util.Hashtable;

public class ShapesPool {

    private static Hashtable<Integer,ShapeObject> used_shapes = new Hashtable<Integer,ShapeObject>();
    private static Hashtable<Integer,ShapeObject> unused_shapes = new Hashtable<Integer,ShapeObject>();


    public ShapesPool(){
        ShapeFactory createshape = new ShapeFactory();
        int c = 0;
        for(int i = 0 ; i < 10 ; i++){
            unused_shapes.put(c++,createshape.createShape(1,true));
            unused_shapes.put(c++,createshape.createShape(2,true));
            unused_shapes.put(c++,createshape.createShape(3,true));
            unused_shapes.put(c++,createshape.createShape(1,false));
            unused_shapes.put(c++,createshape.createShape(2,false));
            unused_shapes.put(c++,createshape.createShape(3,false));
        }
    }


    public ShapeObject get_shape(){
        Enumeration<Integer> e = used_shapes.keys();
        while (e.hasMoreElements()){
            int temp = e.nextElement();
            if(!used_shapes.get(temp).isVisible()){
               used_shapes.remove(temp);
            }
        }




        return null;

    }











}
