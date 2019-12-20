package eg.edu.alexu.csd.oop.game.model.utils;

import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.ClownObject;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.Mode;

import java.util.ArrayList;



public class SnapShot {

    private static ArrayList<GameObject> movableObjects = null;
    private static ArrayList<GameObject> controllableObjects = null;

    public SnapShot(ArrayList<GameObject> movableObjects, ArrayList<GameObject> controllableObjects) {
        this.movableObjects = movableObjects;
        this.controllableObjects = controllableObjects;
    }

    public ArrayList<GameObject> getState_movableObjects() {
        return movableObjects ;
    }

    public ArrayList<GameObject> getState_controllableObjects() {
        return controllableObjects;
    }

}
