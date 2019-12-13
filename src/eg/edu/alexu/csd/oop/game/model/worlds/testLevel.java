package eg.edu.alexu.csd.oop.game.model.worlds;

import eg.edu.alexu.csd.oop.game.model.gameObjects.*;

import java.util.ArrayList;

public class testLevel extends Level {

    public testLevel() {
        super(1400, 700, "Score: " + Score.getInstance().getScore(), 10, 9);
        this.constantObjects = new ArrayList<>();
        this.constantObjects.add(new Background(0,0));
        this.constantObjects.add(new ConveyorBelt(0,100, "/left_conveyor.png"));
        this.constantObjects.add(new ConveyorBelt(900,100, "/right_conveyor.png"));
        this.controllableObjects = new ArrayList<>();
        this.controllableObjects.add(new ClownObject(700-150/2,700-225));
        this.controllableObjects.add(new Stick(740,452, "/right_stick.png"));
        this.controllableObjects.add(new Stick(585,435, "/left_stick.png"));
        this.movableObjects = new ArrayList<>();
    }

    @Override
    public boolean refresh() {
        setStatus("Score: " + Score.getInstance().getScore());
        return true;
    }
}
