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
    int jump = 8;
    public void act() 
    {
        chk();
        
    }    

    public void setLocation(int x,int y){
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x,y);
        if(!getIntersectingObjects(Ground.class).isEmpty())
            super.setLocation(oldX,oldY);
    }

    public void chk(){

        if(Greenfoot.isKeyDown("space")){
            for(int i=1;i<=jump;i++){
                setLocation(getX(),getY()-5);
                setImage("man1.png");
            }
            
        }
        else{
            setLocation(getX(),getY()+10);
            setImage("man.png");
        }
    }
}
