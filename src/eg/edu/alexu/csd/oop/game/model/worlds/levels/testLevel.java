package eg.edu.alexu.csd.oop.game.model.worlds.levels;

import eg.edu.alexu.csd.oop.game.model.gameObjects.constant.*;
import eg.edu.alexu.csd.oop.game.model.gameObjects.controllable.*;
import eg.edu.alexu.csd.oop.game.model.worlds.levelStrategies.Mode;
import java.util.ArrayList;

public class testLevel extends Level {

    private Mode mode;

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

    @Override
    public boolean refresh() {
        this.setStatus(mode.getStatus());
        return mode.refresh();
    }
}
