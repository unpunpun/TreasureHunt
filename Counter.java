import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter  extends Actor
{
    private int scoreCount = 0;
    
        public Counter()
        {
            setImage(new GreenfootImage("Score 0", 30, Color.WHITE, null));
        }
    
    public int getCount(){
        return scoreCount;
    }
    
    /**
     * Increase the total amount displayed on the counter, by a given amount.
     */
    public void scoreCount(int amount)
    {
        scoreCount += amount;
        setImage(new GreenfootImage("Score " + scoreCount, 30, Color.WHITE, null));
    }
    
    public void scoreCount_2(int amount)
    {
        scoreCount += amount;
        setImage(new GreenfootImage("Score " + scoreCount, 70, Color.WHITE, null));
    }
}
