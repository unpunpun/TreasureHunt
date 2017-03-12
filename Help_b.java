import greenfoot.*;

/**
 * Write a description of class help_b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help_b extends Button
{
    /**
     * Act - do whatever the help_b wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Game help;
    
    public void act() 
    {
        help = (Game) getWorld();
        
        if(Greenfoot.mouseClicked(this)){
            //sound("button.wav");
            this.help.getLucky().stop();
            Help helpPage = new Help();
            Greenfoot.setWorld(helpPage);
        }
        
        mouse(337,537,345,425,"button_help2",".png");
        
        if(!checkMouse()){
            setImage("button_help.png");
        }    
    }
    
    public Help_b(Game world) {
        this.help = world;
    }
}
