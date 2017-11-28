import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends Actor
{
    private int score = 0;
    private int credits = 0;
    private int health = 0;
    private int lvl = 1;
    private Safegame safegame = new Safegame();
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       drawInfo(); 
    }   
    
    public void drawInfo()
    {
        health = Human.getHealth();
        score = safegame.getScore();
        credits = safegame.getCredits();
        lvl = safegame.getLvl();
        setImage(new GreenfootImage("Level: "+ lvl + " Score: " + score + " Credits: " + credits + " Health: " + health, 24, greenfoot.Color.WHITE, greenfoot.Color.BLACK));
    }
    
    public void addScore()
    {
        safegame.setScore(safegame.getScore()+1);
    }
    
}
