import greenfoot.*;

/**
 * Write a description of class scrolling here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scrolling extends TimeControl
{
    private GreenfootImage bgImage;
    private boolean timePass = false;
    private int scrollSpeed = 1;
    private GreenfootImage scrollingImage;
    private int scrollPosition = 0;
    
    public Scrolling(){
    }

    /**
     * Act - do whatever the Background wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    public void create(String picName,int xSize,int ySize,int speed){
        scrollSpeed = speed;
        bgImage = new GreenfootImage(picName);
        GreenfootImage background = new GreenfootImage(xSize,ySize);
        scrollingImage = getScrollingImage(800,600);
        background.drawImage(scrollingImage, 0, 0);
        setImage(background);
    }

    private void paint(int position)
    {
        GreenfootImage bg = getImage();
        bg.drawImage(scrollingImage, position, 0);
        bg.drawImage(scrollingImage, position - scrollingImage.getWidth(), 0);
    }

    private GreenfootImage getScrollingImage(int width, int height)
    {
        GreenfootImage image = new GreenfootImage(width, height);
        for(int x = 0; x < width; x += bgImage.getWidth()) {
            for(int y = 0; y < height; y += bgImage.getHeight()) {
                image.drawImage(bgImage, x, y);
            }
        }
        return image;
    } 

    public void nextMap(){
        if(scrollSpeed > 0 && scrollPosition <= 0) {
            scrollPosition = getWorld().getWidth();
        }
        if(scrollSpeed < 0 && scrollPosition >= getWorld().getWidth()) {
            scrollPosition = 0;
        }
        scrollPosition -= scrollSpeed;
        paint(scrollPosition);
    }

    public void timeDelay (int delay){
        this.timePass = false;
        int time = 0;
        while (time < delay){
            time++;
        }
        time =0;
    }
}
