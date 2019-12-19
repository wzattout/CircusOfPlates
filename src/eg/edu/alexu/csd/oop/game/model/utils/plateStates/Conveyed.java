package eg.edu.alexu.csd.oop.game.model.utils.plateStates;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.ConveyorBelt;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.ShapeObject;

import java.util.Iterator;
import java.util.List;

public class Conveyed implements PlateState {

    ShapeObject shape;

    public Conveyed(ShapeObject shape) {
        this.shape = shape;
    }

    private void checkState(List<GameObject> gameObjects) {
        Iterator<GameObject> iterator = gameObjects.iterator();
        while (iterator.hasNext()) {
            GameObject temp = iterator.next();
            if (temp instanceof ConveyorBelt) {
                if (shape.intersects(temp))
                    return;
            }
        }
        shape.setState(new Falling(shape));
    }

    @Override
    public boolean actUponState(List<GameObject> gameObjects, int speed) {
        checkState(gameObjects);
        if (shape.isRight()) {
            shape.setX(shape.getX() - speed);
        } else {
            shape.setX(shape.getX() + speed);
        }
        return false;
    }
}
