import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinWorld extends World
{

    /**
     * Constructor for objects of class WinWorld.
     * 
     */
    public WinWorld()
    {    
        super(800, 600, 1); 
        prepare();
    }
    public void act(){
        showText("Your score : "+Coin.score.getScore(),680,180);
    }
    private void prepare()
    {
        Button_home home = new Button_home();
        addObject(home, 660, 534);
      
        
        
        
    }
}
