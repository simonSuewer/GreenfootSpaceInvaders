import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score : Hallo Tim" + score, 24, greenfoot.Color.GREEN,greenfoot.Color.BLACK));
    }   
    
    
    public void addScore()
    {
        score++;
    }
}
