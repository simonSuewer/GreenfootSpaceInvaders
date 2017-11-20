import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeShip extends Ship
{
    private int shotCount = 0;
    private GreenfootSound soundHorn = new GreenfootSound("horn.wav"); 
    
    public UpgradeShip()
    {
        super();
        this.setMoveSpeed(5);
    }

    public void act() 
    {
        //move left
        if(Greenfoot.isKeyDown("a"))
        {
            this.move(this.getMoveSpeed() * (-1));
        }
        //move right
        if(Greenfoot.isKeyDown("d"))
        {
            this.move(this.getMoveSpeed());
        }
        
        if(Greenfoot.isKeyDown("h"))
        {
            soundHorn.play();
        }
        
        //shot
        if(shotCount != 0) shotCount -= 1;
        
        if(Greenfoot.isKeyDown("space"))
        {
            if(shotCount == 0)
            {
                shotCount = 30;
                getWorld().addObject(new UpgradeShot(), getX(), getY()+5);
            }
        }
    }    
}