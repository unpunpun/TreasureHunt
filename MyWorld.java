import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public GreenfootSound music = new GreenfootSound("Bg2.wav");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        prepare();
    }
    
    public void act(){
        music.playLoop();
    }
    
   
    private void prepare()
    {
        Button_start start = new Button_start();
        addObject(start, 453, 287);
        //start.setLocation(410, 511);
        
        Button_help help = new Button_help();
        addObject(help, 454, 385);
        //help.setLocation(414, 343);
    }
}
