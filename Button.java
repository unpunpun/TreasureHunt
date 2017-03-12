import greenfoot.*;

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    protected boolean checkSound = false;
    protected GreenfootSound sound ;
    protected boolean checkMouse = false;
    
    public boolean checkMouse(){
        return checkMouse;
    }
    
    
    public void mouse(int firstX, int lastX ,int firstY,int lastY,String name ,String lastName){
		MouseInfo mouse = Greenfoot.getMouseInfo();
		if(mouse != null){
		    if(mouse.getY() >=firstY && mouse.getY() <= lastY && mouse.getX() >= firstX && mouse.getX() <= lastX){
		        setImage(name+lastName);
		        checkMouse = true;
			}else{
			    checkMouse = false;
		    }
		}
	}
	
}
