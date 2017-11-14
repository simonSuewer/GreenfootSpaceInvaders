import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShot extends Weapon
{
   private Safegame safegame = new Safegame();
    
    
    
    public EnemyShot()
    {
        super();
        this.turn(90);
    }
    public void act() 
    {
        this.move(Safegame.getBASE_SHOT_SPEED());
        if(this.atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else if(this.isTouching(Human.class))
        {
            System.out.println(Human.getHealth());
            if(Human.getHealth() <= 1)
            {
                this.hit(Human.class); 
                getWorld().removeObject(this);
            }
            else
            {
                Human.setHealth(Human.getHealth() -1);
                getWorld().removeObject(this);
            }
        }
            
    }  
}
