import greenfoot.*;

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start_b extends Button
{
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Game start;
    
    public void act() 
    {
        start = (Game) getWorld();
        
        if(Greenfoot.mouseClicked(this)){
            setImage("button_start2.png");
            //sound("button.wav");
            this.start.getLucky().stop();
            //Player playerWorld = new Player();
            Greenfoot.setWorld(new Map());
        }
        
        mouse(314,514,254,334,"button_start2",".png");
        
        if(!checkMouse()){
            setImage("button_start.png");
        }
        
        
    }    
    
    public Start_b(Game world) {
        this.start = world;
    }
}
