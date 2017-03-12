import greenfoot.*;

/**
 * Write a description of class Bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat extends Enermies
{
    private int type,speed,delay = 2,delay2 = 2;
    static int currentX,currentY;
    //private int speed = -6;
    private boolean loop= true;
    private String[] bat = {"images/monsters/bat_fly0.png","images/monsters/bat_fly1.png"};
    
    public void act(){
        action();
        timer();
        timer2();
        move(-6);
        try{
            currentX = getX();
            currentY = getY();
            if(atWorldEdge()){
                getWorld().removeObject(this);
            }
        }catch(Exception e){}
    }

    public void action(){
        animate(loop, 5, bat);
    }

    public void timer() {
        if(delay >= 3*4) {
            delay = 1 ;
        }else {
            delay ++ ;
        }
    }

    public void timer2() {
        if(delay2 >= 2*20) {
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
