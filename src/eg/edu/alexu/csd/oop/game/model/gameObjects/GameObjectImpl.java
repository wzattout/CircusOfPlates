package eg.edu.alexu.csd.oop.game.model.gameObjects;

import java.awt.image.BufferedImage;

abstract class GameObjectImpl implements GameObject {

    private int x;
    private int y;
    private int width;
    private int height;
    private boolean visible;
    private BufferedImage[] spriteImages;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return spriteImages;
    }
}
