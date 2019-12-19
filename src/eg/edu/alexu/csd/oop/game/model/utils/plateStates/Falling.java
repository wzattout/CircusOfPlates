package eg.edu.alexu.csd.oop.game.model.utils.plateStates;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.LeftStick;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.RightStick;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Plate;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.Iterator;
import java.util.List;

public class Falling implements PlateState {

    ShapeObject shape;

    public Falling(ShapeObject shape) {
        this.shape = shape;
    }

    private void checkState(List<GameObject> gameObjects) {
        Iterator<GameObject> iterator = gameObjects.iterator();
        while (iterator.hasNext()) {
            GameObject temp = iterator.next();
            if (temp instanceof RightStick || temp instanceof LeftStick) {
                if (shape.intersects(temp)) {
                    shape.setState(new Stacked(shape));
                }
            }
        }
    }

    @Override
    public boolean actUponState(List<GameObject> gameObjects, int speed) {
        checkState(gameObjects);
        if (shape instanceof Plate)
            shape.setY(shape.getY() + speed);
        else
            shape.setY(shape.getY() + 2 * speed);
        return false;
    }
}
