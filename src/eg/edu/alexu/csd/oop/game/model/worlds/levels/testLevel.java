package eg.edu.alexu.csd.oop.game.model.worlds.levels;

import eg.edu.alexu.csd.oop.game.GameEngine;
import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.ClownObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.LeftStick;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.RightStick;
import eg.edu.alexu.csd.oop.game.model.utils.SnapShot;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.Mode;

import java.util.ArrayList;
import java.util.Stack;

public class testLevel extends Level {

    private static Stack<SnapShot> states = new Stack<>();
    private Mode mode;

    public testLevel(Mode mode) {
        super(1400, 700, mode.getDifficulty().getSpeed(), mode.getDifficulty().getControlSpeed());
        this.mode = mode;
        this.setStatus(mode.getStatus());
        this.constantObjects = mode.getDifficulty().getConstantObjects();
        this.controllableObjects = mode.getDifficulty().getControllableObjects();
        this.movableObjects = mode.getDifficulty().getMovableObjects();
    }

    public void createSnapShot() {
        SnapShot state = new SnapShot((ArrayList<GameObject>) movableObjects, (ArrayList<GameObject>) controllableObjects);
        states.push(state);
    }

    /*public void undo(SnapShot m) {
        this.mode = m.getState();
        states.pop();
        this.mode = states.peek().getState();
    }*/

    public void replay() {
        Iterator<SnapShot> iterator = states.iterator();
        while(iterator.hasNext()) {System.out.println("sssss");
            SnapShot state = iterator.next();
            this.controllableObjects = state.getState_controllableObjects();
            this.movableObjects = state.getState_movableObjects();
            this.setStatus(mode.getStatus());
            mode.refresh();
        }
    }

    @Override
    public boolean refresh() {
        this.setStatus(this.mode.getStatus());
        createSnapShot();
        return mode.refresh();
    }
}
