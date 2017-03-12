import greenfoot.*;

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Items
{
    public static int coinCounter;
    static int currentX;
    static int currentY;
    Counter counter = new Counter();
    
    public Coin(){
        super.delay = 5;
        setImage("coinGold.png");
        changeImage();
        coinCounter = 0;
    }

    public void act() 
    {
        timer();
        changeImage();
        currentX = getX();
        currentY = getY();
        if(atWorldEdge()){
            getWorld().removeObject(this);
        }
        if(mb){
            move(-4);
        }
    }   

    public void changeImage(){
        setImage("coinGold.png");
    }

    public void timer () {
        if(delay >=9*3) { 
            delay = 1 ; 
        }else {
            delay ++ ; 
        }
    }

    public int getCoinCounter(){
        return this.coinCounter;
    }

    public void setCoinCounter(int cc){
        coinCounter = cc;
    }

}


