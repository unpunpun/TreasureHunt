import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int jump = 10;
    int count = 0;
    boolean canJump = true;
    public void act() 
    {
        chk();
        if(count%8==0){
          setImage("man.png");  
        }
        else{
          setImage("man1.png");
        }
        count++;
        checkHit();
    }    

    public void setLocation(int x,int y){
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x,y);
        if(!getIntersectingObjects(Ground.class).isEmpty())
            super.setLocation(oldX,oldY);
    }

    public void chk(){

        if(Greenfoot.isKeyDown("space")&& canJump){
            
            setLocation(getX(),getY()-120);
            setImage("man1.png");
            Greenfoot.playSound("Jumping.mp3");
           
            
            canJump = false;
        }else{
            /*
            for(int i=1;i<=15;i++){
                setLocation(getX(),getY()+i);
                setImage("man1.png");
            }
            //setLocation(142,406);
            */
           setLocation(getX(),406);
            canJump = true;
            
        }
        
    }
    
    public void checkHit(){
        if(isTouching(Bat.class) || isTouching(Daino.class)){
            Greenfoot.setWorld (new LoseWorld()) ; 
        }
    }
    
}
