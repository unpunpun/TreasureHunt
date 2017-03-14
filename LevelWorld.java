import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public LevelWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        Button_easy easy = new Button_easy();
        addObject(easy, 303, 292);
        
        
        Button_normal normal = new Button_normal();
        addObject(normal, 554, 292);
        
        
        Button_hard hard = new Button_hard();
        addObject(hard, 439, 386);
       
    }
}