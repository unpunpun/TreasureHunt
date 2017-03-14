import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int score=0;
    public Score(){
        setImage(new GreenfootImage("Score : 0",40, Color.WHITE,Color.BLACK));
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Score : "+Score.score,40, Color.WHITE,Color.BLACK));
    }    
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score+=score;
    }
}
