package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Shape1 extends ShapeObject implements Shape {

    private boolean isRight;

    public Shape1(boolean right) {
        super(right ? 1400 : 0, 90, new String[]{"C:\\Users\\dell\\Documents\\70_circus_of_plates\\res\\plate_green.png"});
        this.visible = true;
        this.height = getSpriteImages()[0].getWidth();
        this.width = getSpriteImages()[0].getHeight();
        this.isRight = right;
    }

    @Override
    public boolean isRight() {
        return this.isRight;
    }

    @Override
    public void move(int x, int y, boolean falling, boolean right) {
        if (falling) {
            this.setY(y + 10);
            return;
        }
        if (right) {
            this.setX(x - 10);
            return;
        }
        this.setX(x + 10);
    }
}