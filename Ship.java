import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    private int moveSpeed;
    private Weapon weapon;
    
    public Ship()
    {
        super();
        moveSpeed = Safegame.getBASE_MOVE_SPEED();
    }
    
 
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

    

    public int getMoveSpeed()
    {
        return moveSpeed;
    }

    public Weapon getWeapond()
    {
        return weapon;
    }


    public void setWeapond(Weapon weapon)
    {
        this.weapon = weapon;
    }
    
    public void setMoveSpeed(int newSpeed)
    {
        this.moveSpeed = newSpeed;
    }
}
