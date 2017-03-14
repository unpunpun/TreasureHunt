import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NmWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NmWorld extends World
{

    /**
     * Constructor for objects of class NmWorld.
     * 
     */
    public static GreenfootSound music = new GreenfootSound("Bg2.wav");
    private int time;
    public NmWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(800, 600, 1);
         showText("Time : "+((time)/100),400, 50);
         addObject(new Ground(),399,537);
         addObject(new Man(),142,406);
         addObject(new Score(),400,100);
         prepare();
         time = 12000;
    }
    public void act() {
       music.playLoop();
       showText("Time : "+((time)/100),400, 50);
       time--;
       int cnt = getObjects(Bat.class).size();
       if(cnt < 3) {
           for(int i = 0; i < 3 - cnt; i++) {
               addObject(new Bat(), getWidth()-100+Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(getHeight()/2)-50);
               //addObject(new Bat(), getWidth(), Greenfoot.getRandomNumber(getHeight()/2));
            }
        }
       int cnt2 = getObjects(Coin.class).size();
       if(cnt2 < 20) {
           for(int i = 0; i < 20 - cnt2; i++) {
               addObject(new Coin(), getWidth()-100+Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(200)+getHeight()/2-100);
               //addObject(new Bat(), getWidth(), Greenfoot.getRandomNumber(getHeight()/2));
            }
        }
        if(time<=0){
            music.stop();
            Greenfoot.setWorld(new WinWorld());
        }
      int cnt3 = getObjects(Daino.class).size();
       if(cnt3 < 1) {
           for(int i = 0; time <= 11000 && i < 1 - cnt3; i++) {
               //addObject(new Daino(), getWidth()-100+Greenfoot.getRandomNumber(200), Greenfoot.getRandomNumber(200)+getHeight()/2-100);
               addObject(new Daino(), getWidth()-100+Greenfoot.getRandomNumber(500), 433);
               //addObject(new Bat(), getWidth(), Greenfoot.getRandomNumber(getHeight()/2));
            }
        }
    }
    private void prepare()
    {
        Button_home home = new Button_home();
        addObject(home, 134, 553);
      
        Button_restart restart = new Button_restart();
        addObject(restart, 667, 553);
        
        
    }
}
