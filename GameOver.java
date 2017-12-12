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
        initial();
        
        saveGame.reset();
    }
    
    public void initial() {
        addObject(new BackgroundHeader(), 400, 125);
        addObject(new GameOverBackground(), 400, 400);
        showText("SCORE: "  + saveGame.getLvl(), 400, 500);
        addObject(new ButtonExit(), 400, 700);
    }
}
