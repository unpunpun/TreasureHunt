import greenfoot.*;
import greenfoot.core.WorldHandler;
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class MapOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map extends World
{

    /**
     * Constructor for objects of class MapOne.
     * 
     */
    
    //public static int playerNum ;
    private People people;
    private Counter theCounter ;
    private int TimeCount = 5;
    public Scrolling_items ss;
    public Scrolling bg;
    public static GreenfootSound background = new GreenfootSound("Bg2.wav");
    
    public Map()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        ss = new Scrolling_items(1);
        ss.scrolling(1);
        bg = new Scrolling_bg();
        addObject(bg,400,300);
        people = new People();
        TimeCounter();
        setPaintOrder(People.class, Scrolling_items.class,Counter.class);
        addObject(ss,564,42);
        theCounter = new Counter();
        addObject(theCounter,701,42);
        
        mapOne();
        
    }
    
    public void clearMap(){
        removeObjects(getObjects(Scrolling_bg.class));
        removeObjects(getObjects(Scrolling_bg2.class));
        removeObjects(getObjects(Scrolling_bg3.class));
        removeObjects(getObjects(Items.class));
        removeObjects(getObjects(Enermies.class));
    }
    
    public void mapOne()
    {
        addObject(people, 122, 420);
        
        for(int i = 0; i < 100; i++){
            addObject(new Ground(), 11+2*i, 465);
        }
        
        background.playLoop();
    }
    
    public void mapTwo()
    {
        clearMap();
        bg = new Scrolling_bg2();
        addObject(bg,400,300);
        ss.updateMission(2);
        addObject(people, 122, 420);
       
        for(int i = 0; i < 100; i++){
            addObject(new Ground(), 11+2*i, 465);
        }
        ss.scrolling(2);
        background.playLoop();
    }
    
    public void mapThree()
    {
        clearMap();
        bg = new Scrolling_bg3();
        addObject(bg,400,300);
        ss.updateMission(3);
        addObject(people, 122, 420);
       
        for(int i = 0; i < 100; i++){
            addObject(new Ground(), 11+2*i, 465);
        }
        ss.scrolling(3);
        background.playLoop();
    }
    
    public Counter getCounter()
    {
        return theCounter;
    }
    
    public void TimeCounter(){
        if(TimeCount > 0){
            TimeCount--;
        }else{
            this.stopped();
        }
    }
        
}
