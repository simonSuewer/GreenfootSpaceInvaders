import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HumanShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HumanShot extends Weapon
{
    private static final int SHOT_SPEED = 5;
    
    public HumanShot()
    {
        super();
        this.turn(-90);
    }
    public void act() 
    {
        this.move(SHOT_SPEED);
    }    
}
