package eg.edu.alexu.csd.oop.game.model.gameObjects.constant;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObjectImpl {

    public Background(int x, int y) {
        super(x, y, new String[]{"/circus_background.png"});
        this.visible = true;
    }
}
