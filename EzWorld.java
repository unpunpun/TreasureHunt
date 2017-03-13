import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EzWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EzWorld extends World
{

    /**
     * Constructor for objects of class EzWorld.
     * 
     */
    public EzWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(800, 600, 1);
         addObject(new Ground(),399,537);
    }
}
