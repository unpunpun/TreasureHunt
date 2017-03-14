import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Daino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Daino extends Actor
{
    /**
     * Act - do whatever the Daino wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int frameTimer=10;
    public void act() 
    {
        animation();
        setRotation(180);
        move(5);
        setRotation(0);
        if(getX() < 5)
            getWorld().removeObject(this);
    }   
    
    public void animation(){
        if(frameTimer>0)
            frameTimer--;
        if(frameTimer==5)
            setImage("daino1.png");
        if(frameTimer==0){
            setImage("daino2.png");
            frameTimer=10;
        }
    } 
    
}
