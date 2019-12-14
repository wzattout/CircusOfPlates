package eg.edu.alexu.csd.oop.game.model.gameObjects.movable;

import eg.edu.alexu.csd.oop.game.model.gameObjects.GameObjectImpl;

public class Shape3 extends GameObjectImpl implements Shape {

    @Override
    public void move(int x , int y , boolean falling , boolean right) {
        if(falling){
            y-=3;
            return;
        }
        if(right){
            x--;
            return;
        }
        x++;
    }

    public Shape3(boolean right){
        super(right?0:1, 0, new String[] {"shape3path"});
        this.visible = true;
        this.height = getSpriteImages()[0].getWidth();
        this.width = getSpriteImages()[0].getHeight();
    }






}
