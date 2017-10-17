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
    private int moveSpeed = 5;
    private Weapon weapon;

    public void act() 
    {
        // Add your action code here.
    }
    
    //hs methoden
     public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    
   
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
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
        //this.moveSpeed = moveSpeed;
    }

    public void set_weapond(Weapon weapon)
    {
        this.weapon = weapon;
    }
}
