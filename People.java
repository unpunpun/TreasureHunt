import greenfoot.*; 

/**
 * Write a description of class red_p here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class People extends Avatar
{
    /**
     * Act - do whatever the blue_p wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int delay = 2;
    private static int currentX;
    private static int currentY;
    private int i,imax = 15;
    private boolean isGameOver,isPaused,isJumping;
    private double velocitySpeed = 5;
    private double accelerate = 0.2;
    
    private boolean loop= true;
    private String[] walk = {"people1.png","people2.png",};
    //private String[] jump = {"red_jump0.png","red_jump1.png","red_jump2.png"};
    
    public void act() 
    {
        currentX = getX();
        currentY = getY();
        action();
        jumping();
        checkFall();
        lookForCoin();
        checkSound();
    } 
    
    public void action(){
        if(!Greenfoot.isKeyDown("space") && !isJumping ){
            animate(loop, 12, walk);
            //setImage("blue_walk"+delay/3+".png");
            getImage().scale(80, 120);
        }
        if(Greenfoot.isKeyDown("space") && !isJumping){
            isJumping = true;
            i = 1;
            animate(loop, 5, walk);
            //setImage("blue_jump"+delay/3+".png");
            getImage().scale(80, 120);
        }
        if(onGround()){
            isJumping = false;
        }
    }
    
    public void jumping(){
        if (i > 0)  
        {  
            
            setLocation(getX(), currentY-=15);
            
            if (i++ == imax){
                fall();
                //setImage("blue_walk1.png");
                animate(loop, 5, walk);
                getImage().scale(80, 120);
                i = 0;  
            }
        }
    }
    
    public void fall(){
        setLocation(getX(),getY()+(int)velocitySpeed);
        velocitySpeed = velocitySpeed+accelerate;
    }

    public void checkFall(){
        if(onGround()){
            velocitySpeed = 0;
        }
        else{
            fall();
        }
    }
    
    public boolean onGround(){
        return getOneObjectAtOffset (0,25,Ground.class) !=null;
    }
    
    public boolean isPaused(){
        return this.isPaused;
    }

    public boolean isGameOver(){
        return this.isGameOver;
    }
}