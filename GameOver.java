import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Safegame saveGame = new Safegame();
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
       
        super(800, 800, 1);
        setBackground(new GreenfootImage("backgrounds/game_over.png"));
        saveGame.reset();
        addObject(new ButtonExit(), 400, 700);
    }
}
