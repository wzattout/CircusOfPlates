package eg.edu.alexu.csd.oop.game.model.worlds;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObject;

import java.util.List;

abstract class Level implements World {

    private List<GameObject> constantObjects;
    private List<GameObject> movableObjects;
    private List<GameObject> controllableObjects;
    private int width;
    private int height;
    private String status;
    private int speed;
    private int controlSpeed;

    @Override
    public List<GameObject> getConstantObjects() {
        return constantObjects;
    }

    @Override
    public List<GameObject> getMovableObjects() {
        return movableObjects;
    }

    @Override
    public List<GameObject> getControlableObjects() {
        return controllableObjects;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public boolean refresh() {
        return false;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getControlSpeed() {
        return controlSpeed;
    }
}
