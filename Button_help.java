import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button_help extends Button
{
    /**
     * Act - do whatever the Button_help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean mouseOver =false;
    
    public void act() 
    {
        active();
    }
    
    public void active()
    {
        
    if (Greenfoot.mouseClicked(this) ){
            Greenfoot.playSound("button.mp3");
            Greenfoot.setWorld (new HelpWorld()) ;
        }
    
    if (!mouseOver && Greenfoot.mouseMoved(this))
    {
        setImage("button_help2.png");
        mouseOver = true;
    }
    if (mouseOver && Greenfoot.mouseMoved(null) && ! Greenfoot.mouseMoved(this))
    {
       setImage("button_help.png");
       mouseOver = false;

    }
    }
 
    }  

