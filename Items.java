import greenfoot.*;

/**
 * Write a description of class collect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items extends Objects
{
    public int delay;
    public static boolean mb;
    public static int i,imax;
    protected GreenfootSound sound;
    
    public boolean moveBack(){
        return mb;
    }
    
    public void setMoveBack(boolean mb){
        this.mb = mb;
    }
    
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth()-10){
            return true;
        }
        if(getY() < 10 || getY() > getWorld().getHeight()-10){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void setI(int i,int imax){
        this.i = i;
        this.imax = imax;
    }
    
    public void sound(String music){
        sound = new GreenfootSound (music);
        sound.play();
    }
}