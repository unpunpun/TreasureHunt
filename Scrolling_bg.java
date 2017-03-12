import greenfoot.*;

/**
 * Write a description of class scrolling_bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scrolling_bg extends Scrolling
{
    public Scrolling_bg(){
        create("images/mapone.png",800,600,2);
    }
  
    public void act(){
        nextMap();
    }
}    