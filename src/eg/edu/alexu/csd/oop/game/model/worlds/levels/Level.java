package eg.edu.alexu.csd.oop.game.model.worlds.levels;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.World;
import eg.edu.alexu.csd.oop.game.model.utils.score.Score;
import eg.edu.alexu.csd.oop.game.model.utils.snapshot.Caretaker;
import eg.edu.alexu.csd.oop.game.model.utils.snapshot.Originator;
import eg.edu.alexu.csd.oop.game.model.utils.snapshot.SnapShot;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.Mode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Level implements World {

    private List<GameObject> constantObjects = new ArrayList<>();
    private List<GameObject> movableObjects = new ArrayList<>();
    private List<GameObject> controllableObjects = new ArrayList<>();
    private int width;
    private int height;
    private String status;
    private int speed;
    private int controlSpeed;
    private Mode mode;
    private Originator originator = new Originator();
    private Caretaker caretaker = new Caretaker();

    public Level(Mode mode) {
        try {
            Score.getInstance().resetScore();
            this.width = 1400;
            this.height = 700;
            this.mode = mode;
            this.speed = mode.getDifficulty().getSpeed();
            this.controlSpeed = mode.getDifficulty().getControlSpeed();
            this.setStatus(mode.getStatus());
            this.constantObjects = mode.getDifficulty().getConstantObjects();
            this.controllableObjects = mode.getDifficulty().getControllableObjects();
            this.movableObjects = mode.getDifficulty().getMovableObjects();
        } catch (NullPointerException ignored) {
        }
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
    public boolean refresh() {
        this.setStatus(this.mode.getStatus());
        List<GameObject> controllableObjects = new ArrayList<>(getControlableObjects());
        List<GameObject> movableObjects = new ArrayList<>(getMovableObjects());
        caretaker.addSnapshot(originator.createSnapshot(controllableObjects, movableObjects));
        return mode.refresh();
    }

    @Override
    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public void replay() {
        Iterator<SnapShot> iterator = caretaker.getHistory().iterator();
        while (iterator.hasNext()) {
            SnapShot snapShot = iterator.next();
            this.controllableObjects = snapShot.getControllableObjects();
            this.movableObjects = snapShot.getMovableObjects();
        }
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
