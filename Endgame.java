import greenfoot.*;

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endgame extends World
{
    private Counter theCounter;
    
    /**
     * Constructor for objects of class EndGame.
     * 
     */
    public Endgame(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        theCounter = new Counter();
        theCounter.scoreCount_2(score);
        addObject(theCounter,400,250);
    }
    
    
}
