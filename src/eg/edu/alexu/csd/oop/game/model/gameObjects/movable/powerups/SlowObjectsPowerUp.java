package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.powerups;

public class SlowObjectsPowerUp extends PowerUp {

    public SlowObjectsPowerUp(int x, int y) {
        super(x, y, new String[]{System.getProperty("user.dir") + "\\res\\slow_time.png"});
    }
}
