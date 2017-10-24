import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Settings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settings extends World
{

    /**
     * Constructor for objects of class Settings.
     * 
     */
    public Settings()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        initial();
    }
    
        public void initial() {
        addObject(new BackgroundHeader(), 400, 125);
        addObject(new ButtonMusik(), 400, 350);
        addObject(new ButtonSfxSounds(), 400, 450);
        addObject(new ButtonMitwirkende(), 400, 550);
        addObject(new ButtonExit(), 400, 700);
    }
}
