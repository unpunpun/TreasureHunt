import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class TimeControl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeControl extends Actor
{
    public boolean timePass = false;
    private int time;
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TimeControl()
    {
        setImage(new GreenfootImage("Time: 0", 30, Color.WHITE, null));
    }
    public int getTime(){
        return time;
    }
      

    public void timeDelay (int delay){
        this.timePass = false;
        this.time = time+1;
        if(time < delay)return;
        time = 0;
        timePass = true;
    }

    public boolean timePass(){
        return timePass;
    }    
}
