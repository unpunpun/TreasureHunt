import greenfoot.*;

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daino extends Enermies
{
    private int type,speed,delay = 2,delay2 = 2;
    static int currentX,currentY;
    //private int speed = -7;
    private boolean loop= true;
    private String[] worm = {"images/monsters/daino_walk0.png","images/monsters/daino_walk1.png"};
    
    public void act(){
        action();
        timer();
        timer2();
        move(-7);
        lookForAvatar();
        try{
            currentX = getX();
            currentY = getY();
            if(atWorldEdge() || isTouching(Avatar.class)){
                getWorld().removeObject(this);
            }
        }catch(Exception e){}
    }

    public void action(){
        animate(loop, 5, worm);
    }

    public void timer() {
        if(delay >= 3*4) {
            delay = 1 ;
        }else {
            delay ++ ;
        }
    }

    public void timer2() {
        if(delay2 >= 6*10) {
            delay2 = 1 ;
        }else {
            delay2 ++ ;
        }
    }

    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth()-10){
            return true;
        }
        if(getY() < 10 || getY() > getWorld().getHeight()-10){
            return true;
        }
        else{
            return false;
        }
    }
}
