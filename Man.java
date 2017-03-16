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
    int count = 61;
    boolean canJump = true;
    public void act() 
    {
        chk();
        if(count>0){
          count--;
        }
       if(count==60){
          setImage("man1.png");
        }
         if(count==30){
          setImage("man.png");
        }
        if(count==0){
          count=61;
        }
        checkHit();
    }    

    public void setLocation(int x,int y){
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x,y);
        if(!getIntersectingObjects(Ground.class).isEmpty()){
            super.setLocation(oldX,oldY);
        }
    }

    public void chk(){

        if(Greenfoot.isKeyDown("space")&&canJump){
            for(int i =0;i<8;i++){
                if(i<10){
                    setLocation(getX(),getY()-i);
                }
            }
         setImage("man1.png");
         Greenfoot.playSound("Jumping.mp3");
         
        }
        else{
            setLocation(getX(),getY()+8);
        }

    }
    
    public void checkHit(){
        Actor a = getOneObjectAtOffset(0,0,Bat.class);
        Actor b = getOneObjectAtOffset(0,0,Daino.class);
        if(a!=null ||b!=null){
            Greenfoot.setWorld (new LoseWorld()) ; 
        }
    }
    
}
