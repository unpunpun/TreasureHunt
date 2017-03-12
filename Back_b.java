import greenfoot.*;

/**
 * Write a description of class Back_b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back_b extends Button
{
    /**
     * Act - do whatever the help_b wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Help help;
    
    public void act() 
    {
        help = (Help) getWorld();
        
        if(Greenfoot.mouseClicked(this)){
            //sound("button.wav");
            Game back = new Game();
            Greenfoot.setWorld(back);
        }
        
        mouse(535,735,267,347,"button_back2",".png");
        
        if(!checkMouse()){
            setImage("button_back.png");
        }    
    }
}