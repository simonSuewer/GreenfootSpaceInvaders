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
        if(this.atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else if(this.hit(Enemy.class))
        {
            getWorld().removeObject(this);
        }
        else if(this.isTouching(Enemy.class))
        {
            System.out.println(Human.getHealth());
            Enemy actor = (Enemy) getOneObjectAtOffset(0, 0, Enemy.class);
            System.out.println(actor.getHealth())
            ;
            if(actor.getHealth() <= 1)
            {
                this.hit(Enemy.class); 
                getWorld().removeObject(this);
            }
            else
            {
                Human.setHealth(actor.getHealth() -1);
                getWorld().removeObject(this);
            }
        }
    }
}

