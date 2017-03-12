import greenfoot.*;

/**
 * Write a description of class Enermies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enermies extends Objects
{
    /**
     * Act - do whatever the kk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public void lookForAvatar()
    {
        if (canSee(Avatar.class))
        {
            eat(Enermies.class);
            Map bg = (Map) getWorld();  // get a reference to the world
            Counter counter = bg.getCounter();  // get a reference to the counter
            counter.scoreCount(-10);
        }
        
    }
    
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }
}


