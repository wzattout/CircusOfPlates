package eg.edu.alexu.csd.oop.game.model.worlds.levels;

import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.*;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.*;
import eg.edu.alexu.csd.oop.game.model.utils.SnapShot;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.modes.Mode;
import java.util.ArrayList;
import java.util.Stack;

public class testLevel extends Level {

    private Mode mode;
    private static Stack<SnapShot> states = new Stack<>();

    public testLevel(Mode mode) {
        super(1400, 700, 10, 9);
        this.mode = mode;
        this.setStatus(mode.getStatus());
        this.constantObjects = new ArrayList<>();
        this.constantObjects.add(new Background(0,0));
        this.constantObjects.add(new ConveyorBelt(-30,100, "/conveyor.png"));
        this.constantObjects.add(new ConveyorBelt(1400-470+30,100, "/conveyor.png"));
        this.controllableObjects = new ArrayList<>();
        ClownObject clown = new ClownObject(625,475);
        this.controllableObjects.add(clown);
        this.controllableObjects.add(new RightStick(740,452, clown));
        this.controllableObjects.add(new LeftStick(585,435, clown));
        this.movableObjects = new ArrayList<>();
    }


    public void createSnapShot(){
        SnapShot state = new SnapShot(mode);
        states.push(state);
    }

    //if u want undo u can't redo again :)
    public void undo(SnapShot m){
        this.mode = m.getState();
        states.pop();
    }


    public void replay(){
        for(SnapShot i : states){
            this.mode = i.getState();
            this.setStatus(mode.getStatus());
            mode.refresh();
        }
    }

    @Override
    public boolean refresh() {
        createSnapShot();
        this.setStatus(mode.getStatus());
        return mode.refresh();
    }
}
