import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class scrolling_items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scrolling_items extends Scrolling
{
    
    Avatar p;
    private Ground g1;
    private Counter c;
    private Coin c1,c2,c3,c4,c5,c6,c7;
    Map map ;
    Endgame end;
    int mission;
    public Scrolling_items(int x){
        this.p = p;
        g1 = new Ground();
        c = new Counter();
        c1 = new Coin();
        c2 = new Coin();
        c3 = new Coin();
        c4 = new Coin();
        c5 = new Coin();
        c6 = new Coin();
        c7 = new Coin();
        mission = x;
        //s1 = new Star();
        //s2 = new Star();
    }

    /**
     * Act - do whatever the Scrolling wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        scrolling(mission);
        update();
    } 
    
    public void updateMission(int x){
        mission = x;
    }

    public void scrolling(int level){
        int x = Greenfoot.getRandomNumber(2000);
        c1.setMoveBack(true);
        if(level == 1){
        if(x < 500){
            if(x<250){
                if(x < 20){
                    getWorld().addObject(c1, getWorld().getWidth()-11, 410);
                }
                else if(x > 20 && x < 40){
                    getWorld().addObject(c2, getWorld().getWidth()-11, 300);
                    getWorld().addObject(c7, getWorld().getWidth()-11, 270);
                }
                else if(x > 40 && x < 60){
                    getWorld().addObject(c3, getWorld().getWidth()-11, 200);
                    getWorld().addObject(c4, getWorld().getWidth()-11, 170);
                    getWorld().addObject(c5, getWorld().getWidth()-11, 140);
                }
                else{
                    //getWorld().addObject(c6, getWorld().getWidth()-11, getRandomNumber(150,360) );
                }
            }
        }
        else
        {
          if(x>515 && x <530){//bat
                getWorld().addObject(new Bat(), getWorld().getWidth()-12, getRandomNumber(120,170));
                //Greenfoot.playSound("PeacockBird.mp3");
            }       
        }
    }
    
    if(level == 2){
        if(x < 500){
            if(x<250){
                if(x < 20){
                    getWorld().addObject(c1, getWorld().getWidth()-11, 410);
                }
                else if(x > 20 && x < 40){
                    getWorld().addObject(c2, getWorld().getWidth()-11, 300);
                    getWorld().addObject(c7, getWorld().getWidth()-11, 270);
                }
                else if(x > 40 && x < 60){
                    getWorld().addObject(c3, getWorld().getWidth()-11, 200);
                    getWorld().addObject(c4, getWorld().getWidth()-11, 170);
                    getWorld().addObject(c5, getWorld().getWidth()-11, 140);
                }
                else{
                    //getWorld().addObject(c6, getWorld().getWidth()-11, getRandomNumber(150,360) );
                }
            }
        }
        else
        {
          if(x>515 && x <530){//bat
                getWorld().addObject(new Bat(), getWorld().getWidth()-12, getRandomNumber(120,170));
                //Greenfoot.playSound("PeacockBird.mp3");
            }       
        }
    }
    
    if(level == 3){
        if(x < 500){
            if(x<250){
                if(x < 20){
                    getWorld().addObject(c1, getWorld().getWidth()-11, 410);
                }
                else if(x > 20 && x < 40){
                    getWorld().addObject(c2, getWorld().getWidth()-11, 300);
                    getWorld().addObject(c7, getWorld().getWidth()-11, 270);
                }
                else if(x > 40 && x < 60){
                    getWorld().addObject(c3, getWorld().getWidth()-11, 200);
                    getWorld().addObject(c4, getWorld().getWidth()-11, 170);
                    getWorld().addObject(c5, getWorld().getWidth()-11, 140);
                }
                else{
                    //getWorld().addObject(c6, getWorld().getWidth()-11, getRandomNumber(150,360) );
                }
            }
        }
        else
        {
          if(x>515 && x <530){//bat
                getWorld().addObject(new Bat(), getWorld().getWidth()-12, getRandomNumber(120,170));
                //Greenfoot.playSound("PeacockBird.mp3");
            }       
        }
    }
    }
    
    int time = 0;
    int timeCount = 0;
    public void update() 
    {
        setImage(new GreenfootImage("Time: " + timeCount, 30, Color.WHITE, null));
        time++;
        
        if(time > 60){
          timeCount++;
          time = 0;
          
        }
        if(timeCount >= 20){
            ((Map)getWorld()).mapTwo();
          /*Map map = (Map)getWorld();
          int score = map.getCounter().getCount();
          Greenfoot.stop();
          this.end = new Endgame(score);
          Greenfoot.setWorld(this.end);*/
          timeCount = 0;
        }
    } 
    
    public int getRandomNumber(int start,int end)  
    {  
        int normal = Greenfoot.getRandomNumber(end-start+1);  
        return normal+start;  
    } 
}