import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{
    Safegame savegame = new Safegame();
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        initial();
        savegame.reset();
    }
    public void initial() {
        addObject(new BackgroundHeader(), 400, 125);
        addObject(new win(), 400, 400);
        addObject(new ButtonExit(), 400, 700);
    }
}
