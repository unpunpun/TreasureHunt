import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;  
import java.awt.*;
import greenfoot.core.*; 

/**
 * Write a description of class avatar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avatar extends Actor
{
    /**
     * Act - do whatever the avatar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    protected boolean pass;
    private boolean loop = false;
    private int timedelay = 0;
    String[] picture;
    private int timer;
    private int number = 0;
    GreenfootSound sound;
    
    public void timeter(int time){
        pass = false;
        timer++;
        if(timer<time) return;
        pass = true;
        timer= 0;
    }
    
    public void animate(boolean loop,int timedelay,String[] picture){
        timeter(timedelay);
        if(pass==true){
            setImage(picture[number]);
            number++;
            if(loop==true && number >= picture.length){
                number=0;
            } else if(loop==false && number >= picture.length){
                getWorld().removeObject(this);
            }
        }
    }
    
    
    private double exactX;
    private double exactY;

    /**
     * Move forward by the specified distance.
     * (Overrides the method in Actor).
     */
    @Override
    public void move(int distance)
    {
        move((double)distance);
    }
    
    /**
     * Move forward by the specified exact distance.
     */
    public void move(double distance)
    {
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians) * distance;
        double dy = Math.sin(radians) * distance;
        setLocation(exactX + dx, exactY + dy);
    }
    
    /**
     * Set the location using exact coordinates.
     */
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }
    
    /**
     * Set the location using integer coordinates.
     * (Overrides the method in Actor.)
     */
    @Override
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    /**
     * Return the exact x-coordinate (as a double).
     */
    public double getExactX() 
    {
        return exactX;
    }

    /**
     * Return the exact y-coordinate (as a double).
     */
    public double getExactY() 
    {
        return exactY;
    }
    
    public void lookForCoin()
    {
        if ( canSee(Coin.class) )
        {
            eat(Coin.class);
            Map bg = (Map) getWorld();  // get a reference to the world
            Counter counter = bg.getCounter();  // get a reference to the counter
            counter.scoreCount(100);
            sound("collectMoney.mp3");
            sound.play();
        }
        
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneIntersectingObject(clss);
        return actor != null;        
    }
    
    public void eat(Class clss)
    {
        Actor actor = getOneIntersectingObject(clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
    
    public void sound(String music){
            sound = new GreenfootSound (music);
    }
    
    public void checkSound(){
        if(isTouching(Coin.class)){
            
            //Greenfoot.playSound("pick.mp3");
        }
        
    }
    
}
