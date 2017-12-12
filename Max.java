import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Max here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Max extends Enemy
{
    private Weapon weapon = new Weapon();
    private int shotCount = 0;
    private int max_shot = 5;
    
    public void act() 
    {
       //shot
        if(shotCount != 0) shotCount -= 1;
        if((Greenfoot.getRandomNumber(100) < 3) && (getWorld().getObjects(EnemyShot.class).size())< max_shot)
        {
            getWorld().addObject(new EnemyShot(), getX()-200+(Greenfoot.getRandomNumber(400)), getY()+5);
            shotCount = 30;
        }
        
        if((Greenfoot.getRandomNumber(100) < 2) && (getWorld().getObjects(EnemyRocket.class).size())< 1)
        {
            getWorld().addObject(new EnemyRocket(), getX(), getY()+5);
            shotCount = 30;
        }
    }    
}
