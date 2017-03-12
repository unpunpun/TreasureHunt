import greenfoot.*;

/**
 * Write a description of class objects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objects extends Actor
{
    private double exactX;
    private double exactY;

    /**
     * Move forward by the specified distance.
     * (Overrides the method in Actor).
     */
    @Override
    public void move(int distance)
    {
        move((double)distance);
    }
    
    /**
     * Move forward by the specified exact distance.
     */
    public void move(double distance)
    {
        double radians = Math.toRadians(getRotation());
        double dx = Math.cos(radians) * distance;
        double dy = Math.sin(radians) * distance;
        setLocation(exactX + dx, exactY + dy);
    }
    
    /**
     * Set the location using exact coordinates.
     */
    public void setLocation(double x, double y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation((int) (x + 0.5), (int) (y + 0.5));
    }
    
    /**
     * Set the location using integer coordinates.
     * (Overrides the method in Actor.)
     */
    @Override
    public void setLocation(int x, int y) 
    {
        exactX = x;
        exactY = y;
        super.setLocation(x, y);
    }

    /**
     * Return the exact x-coordinate (as a double).
     */
    public double getExactX() 
    {
        return exactX;
    }

    /**
     * Return the exact y-coordinate (as a double).
     */
    public double getExactY() 
    {
        return exactY;
    }
    
    
    protected boolean pass;
    private boolean loop = false;
    private int timedelay = 0;
    String[] picture;
    private int timer;
    private int number = 0;
    
    public void timeter(int time){
        pass = false;
        timer++;
        if(timer<time) return;
        pass = true;
        timer= 0;
    }
    
    public void animate(boolean loop,int timedelay,String[] picture){
        timeter(timedelay);
        if(pass==true){
            setImage(picture[number]);
            number++;
            if(loop==true && number >= picture.length){
                number=0;
            } else if(loop==false && number >= picture.length){
                getWorld().removeObject(this);
            }
        }
    }
    
}