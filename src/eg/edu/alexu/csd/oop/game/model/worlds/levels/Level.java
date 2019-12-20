package eg.edu.alexu.csd.oop.game.model.worlds.levels;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.World;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.Mode;

import java.util.List;

public class Level implements World {

    //private static Stack<SnapShot> states = new Stack<>();
    protected List<GameObject> constantObjects;
    protected List<GameObject> movableObjects;
    protected List<GameObject> controllableObjects;
    private int width;
    private int height;
    private String status;
    private int speed;
    private int controlSpeed;
    private Mode mode;

    public Level(Mode mode) {
        this.width = 1400;
        this.height = 700;
        this.mode = mode;
        this.speed = mode.getDifficulty().getSpeed();
        this.controlSpeed = mode.getDifficulty().getControlSpeed();
        this.setStatus(mode.getStatus());
        this.constantObjects = mode.getDifficulty().getConstantObjects();
        this.controllableObjects = mode.getDifficulty().getControllableObjects();
        this.movableObjects = mode.getDifficulty().getMovableObjects();
    }

   /*public void createSnapShot() {
        SnapShot state = new SnapShot((ArrayList<GameObject>) movableObjects, (ArrayList<GameObject>) controllableObjects);
        states.push(state);
    }

    public void replay() {
        Iterator<SnapShot> iterator = states.iterator();
        while (iterator.hasNext()) {
            System.out.println("sssss");
            SnapShot state = iterator.next();
            this.controllableObjects = state.getState_controllableObjects();
            this.movableObjects = state.getState_movableObjects();
            this.setStatus(mode.getStatus());
            mode.refresh();
        }
    }*/

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
        this.setStatus(this.mode.getStatus());
        //createSnapShot();
        return mode.refresh();
    }

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
