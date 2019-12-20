package eg.edu.alexu.csd.oop.game.model.utils.snapshot;

import eg.edu.alexu.csd.oop.game.GameObject;

import java.util.ArrayList;

public class SnapShot {

    private ArrayList<GameObject> capturedObjects;

    public SnapShot(ArrayList<GameObject> movableObjects, ArrayList<GameObject> controllableObjects) {
        capturedObjects = movableObjects;
        capturedObjects.addAll(controllableObjects);
    }

    public ArrayList<GameObject> getCapturedObjects() {
        return capturedObjects;
    }
}
