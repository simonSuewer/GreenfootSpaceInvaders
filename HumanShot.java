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
    private ActionSounds actionSounds = new ActionSounds();
    private Safegame safegame = new Safegame();
    public HumanShot()
    {
        super();
        this.turn(-90);
    }
    public void act() 
    {
        this.move(SHOT_SPEED);
        Enemy actor = (Enemy) getOneObjectAtOffset(0, 0, Enemy.class);
        if(this.atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else if(actor != null)
        {
            actionSounds.playHitmarkerSound();
            if(actor.getHealth() <= 1)
            {
                this.hit(Enemy.class); 
                if(Enemy.get_counter()!=30)
                {
                    System.out.println(Enemy.get_counter());
                    getWorld().removeObject(this);
                }
                
            }
            else
            {
                actor.setHealth(actor.getHealth() - safegame.getUpgrade().getDamage());
                getWorld().removeObject(this);
            }
        }
    }
}

