import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static Score score = new Score();
    public void act() 
    {
        // Add your action code here'
        if(getX() < 5)
            getWorld().removeObject(this);
        else eat();
        move(-5);
    }    
    
    public void eat(){
        if(isTouching(Man.class)){
            score.setScore(5);
            Greenfoot.playSound("collectMoney.mp3"); 
            getWorld().removeObject(this);
        }
    }
}
