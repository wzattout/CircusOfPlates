package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.powerups;

public class ColorBlindPowerUp extends PowerUp {

    public ColorBlindPowerUp(int x, int y) {
        super(x, y, new String[]{System.getProperty("user.dir") + "\\res\\color_blind.png"});
    }
}
