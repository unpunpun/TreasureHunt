import greenfoot.*;
import greenfoot.core.WorldHandler;
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Game extends World
{
    public static GreenfootSound bg = new GreenfootSound("Bg3.wav");
    
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        startGame();
        
    }

    public void startGame()
    {
        //setBackground("start.png");

        Start_b start = new Start_b(this);
        addObject(start, 414, 294);
        Help_b help = new Help_b(this);
        addObject(help, 437, 385);
        
        bg.playLoop();
    }
    
    public GreenfootSound getLucky() {
        return this.bg;
    }
}

