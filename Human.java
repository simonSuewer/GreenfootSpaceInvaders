import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Ship
{
    
    private Upgrade upgrade = new Upgrade();
    private int shotCount = 0;
    private GreenfootSound soundHorn = new GreenfootSound("horn.wav"); 
 
    public void act() 
    {
        
        
        //move left
        if(Greenfoot.isKeyDown("a"))
        {
            this.move(this.get_moveSpeed() * (-1));
        }
        //move right
        if(Greenfoot.isKeyDown("d"))
        {
            this.move(this.get_moveSpeed());
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
                getWorld().addObject(new HumanShot(), getX(), getY()+5);
            }
        }
    }    
}
