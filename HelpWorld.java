import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public HelpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        prepare();
    }
    
    private void prepare()
    {
        Button_back back = new Button_back();
        addObject(back, 374, 494);
        //start.setLocation(410, 511);
        
        //Button_help help = new Button_help();
        //addObject(help, 454, 385);
        //help.setLocation(414, 343);
    }
}
