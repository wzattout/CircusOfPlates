package eg.edu.alexu.csd.oop.game.model.worlds.levels;

import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.*;
import eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes.Shape;
import eg.edu.alexu.csd.oop.game.model.utils.ShapeFactory;
import eg.edu.alexu.csd.oop.game.model.utils.ShapesPool;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.difficulties.Difficulty;
import eg.edu.alexu.csd.oop.game.GameObject;
import eg.edu.alexu.csd.oop.game.control.SnapShot;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.Mode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class testLevel extends Level {

	
	
    private Mode mode;
    private Difficulty difficulty;
    private static Stack<SnapShot> states = new Stack<>();

    public testLevel(Mode mode, Difficulty difficulty) {
        super(1400, 700, difficulty.getSpeed(), difficulty.getControlSpeed());
        this.mode = mode;
        this.difficulty = difficulty;
        this.setStatus(mode.getStatus());
        this.constantObjects = difficulty.getConstantObjects();
        this.controllableObjects = new ArrayList<>();
        ClownObject clown = new ClownObject(625, 475);
        this.controllableObjects.add(clown);
        this.controllableObjects.add(new RightStick(740, 452, clown));
        this.controllableObjects.add(new LeftStick(585, 435, clown));
        this.movableObjects = new ArrayList<>(); 
        
    }

    public void createSnapShot() {
        SnapShot state = new SnapShot(mode);
        states.push(state);
    }

    //if u want undo u can't redo again :)
    public void undo(SnapShot m) {
        this.mode = m.getState();
        states.pop();
    }

    public void replay() {
        for (SnapShot i : states) {
            this.mode = i.getState();
            this.setStatus(mode.getStatus());
            mode.refresh();
        }
    }

    @Override
    public boolean refresh() {
        
    	createSnapShot();
    	Iterator<GameObject> iterator = movableObjects.iterator();
        while(iterator.hasNext()) {
    		GameObject temp = iterator.next();
    		Shape shape = (Shape) temp;
    		shape.move(temp.getX(), temp.getY(),temp.getX() > 470 && temp.getX() < 930,shape.isright());
        }
        this.movableObjects.add(ShapesPool.get_instance().get_shape());
        this.setStatus(mode.getStatus());
        return mode.refresh();
    }
}
