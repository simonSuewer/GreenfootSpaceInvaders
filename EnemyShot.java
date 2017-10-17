import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShot extends Weapon
{
    private static final int SHOT_SPEED = 5;
    
    public EnemyShot()
    {
        super();
        this.turn(90);
    }
    public void act() 
    {
        this.move(SHOT_SPEED);
        if(this.atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else{
            this.hit(Human.class);  
        }
        
        
    }    
}
