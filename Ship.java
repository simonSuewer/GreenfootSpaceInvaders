import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    private int health;
    private int moveSpeed;
    private Weapon weapon;



    public void act() 
    {
        // Add your action code here.
    }

    //getter
    public int get_health()
    {
        return health;
    }

    public int get_moveSpeed()
    {
        return moveSpeed;
    }

    public Weapon get_weapond()
    {
        return weapon;
    }

    //setter
    public void set_health(int health)
    {
        this.health = health;
    }

    public void set_moveSpeed(int moveSpeed)
    {
        this.moveSpeed = moveSpeed;
    }

    public void set_weapond(Weapon weapon)
    {
        this.weapon = weapon;
    }
}
