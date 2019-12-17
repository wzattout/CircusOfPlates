package eg.edu.alexu.csd.oop.game.model.worlds.levels;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.World;

import java.util.List;

public abstract class Level implements World {

    protected List<GameObject> constantObjects;
    protected List<GameObject> movableObjects;
    protected List<GameObject> controllableObjects;
    private int width;
    private int height;
    private String status;
    private int speed;
    private int controlSpeed;

    public Level(int width, int height, int speed, int controlSpeed) {
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.controlSpeed = controlSpeed;
    }

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
    public abstract boolean refresh();

    @Override
    public String getStatus() {
        return status;
    }

    protected void setStatus(String status) {
        this.status = status;
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
