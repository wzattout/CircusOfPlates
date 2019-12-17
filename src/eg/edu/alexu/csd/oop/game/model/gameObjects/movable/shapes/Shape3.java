package eg.edu.alexu.csd.oop.game.model.gameObjects.movable.shapes;

public class Shape3 extends ShapeObject implements Shape {

	private boolean isright;
	
    public Shape3(boolean right) {
        super(right ? 1400 : 0, 40, new String[]{"C:\\Users\\dell\\Documents\\circus_of_plates\\res\\slow_time.png"});
        this.visible = true;
        this.height = getSpriteImages()[0].getWidth();
        this.width = getSpriteImages()[0].getHeight();
        this.isright = right;
    }

    @Override
    public boolean isright() {
    	return this.isright;
    }
    
    @Override
    public void move(int x, int y, boolean falling, boolean right) {
        if (falling) {
            this.setY(y+30);
            return;
        }
        if (right) {
            this.setX(x-10);
            return;
        }
        this.setX(x+10);
    }
}
