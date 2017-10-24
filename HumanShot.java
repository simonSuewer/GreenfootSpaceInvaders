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
        else{
            if(this.hit(Enemy.class))
            {
                getWorld().removeObject(this);
            }
            else
            {
                if(this.isTouching(ButtonHealth.class))
                {
                    Upgrade.addHealth(1);
                    getWorld().removeObject(this);
                }
                else
                {
                    if(this.isTouching(ButtonDamage.class))
                    {
                        Upgrade.addDamage(1);
                        getWorld().removeObject(this);
                    }
                    else
                    {
                        if(this.isTouching(ButtonNextLvl.class))
                        {
                            System.out.println(Upgrade.getHealth()+""+Upgrade.getDamage());
                            getWorld().removeObject(this);
                        } 
                    }
                }
            }           
        }
    }    
}
