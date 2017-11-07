import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Ship
{
    private int health = 5;
    private int shotCount = 0;

    private GreenfootSound soundHorn = new GreenfootSound("horn.wav"); 

    public Human()
    {
        super();
        Safegame load = new Safegame();
        this.health = load.getUpgrade().getHealth();
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
                getWorld().addObject(new HumanShot(), getX(), getY()+5);
            }
        }
    }    
}
