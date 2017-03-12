import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Endscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endscore extends Actor
{
    /**
     * Act - do whatever the Endscore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public Endscore(int score) 
    {
        // Add your action code here.
        Color c = new Color(255,255,255,0);
        
        setImage(new GreenfootImage(""+score,25,Color.BLACK,c));
    }    
}
