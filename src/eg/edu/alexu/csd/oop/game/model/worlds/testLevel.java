package eg.edu.alexu.csd.oop.game.model.worlds;

import eg.edu.alexu.csd.oop.game.model.gameObjects.Background;
import eg.edu.alexu.csd.oop.game.model.gameObjects.ClownObject;
import eg.edu.alexu.csd.oop.game.model.gameObjects.Score;
import eg.edu.alexu.csd.oop.game.model.gameObjects.Stick;

import java.util.ArrayList;

public class testLevel extends Level {

    public testLevel() {
        super(1400, 700, "Score: " + Score.getInstance().getScore(), 10, 9);
        this.constantObjects = new ArrayList<>();
        this.constantObjects.add(new Background(0,0));
        this.controllableObjects = new ArrayList<>();
        this.controllableObjects.add(new ClownObject(700-150/2,700-225));
        this.controllableObjects.add(new Stick(700,421));
        this.controllableObjects.add(new Stick(595,400));
        this.movableObjects = new ArrayList<>();
    }

    @Override
    public boolean refresh() {
        setStatus("Score: " + Score.getInstance().getScore());
        return true;
    }

}
