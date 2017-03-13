import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat extends Actor
{
    /**
     * Act - do whatever the Bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int frameTimer=10;
    public void act() 
    {
        animation();
    }   
    
    public void animation(){
        if(frameTimer>0)
            frameTimer--;
        if(frameTimer==5)
            setImage("bat1.png");
        if(frameTimer==0){
            setImage("bat2.png");
            frameTimer=10;
        }
    }
}
