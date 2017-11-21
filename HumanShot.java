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
        getWorld().showText("", 400, 500);
        Enemy actor = (Enemy) getOneObjectAtOffset(0, 0, Enemy.class);
        if(this.atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else if(actor != null)
        {
            actionSounds.playHitmarkerSound();
            safegame.setScore(safegame.getScore() + safegame.getLvl() * safegame.getLvl());
            if(actor.getHealth() <= safegame.getUpgrade().getDamage())
            {
                this.hit(Enemy.class); 
                safegame.setCredits(safegame.getCredits() + safegame.getLvl() * safegame.getLvl());
                if(Enemy.get_counter()!=30)
                {
                    getWorld().removeObject(this);
                }
                
            }
            else
            {
                actor.setHealth(actor.getHealth() - safegame.getUpgrade().getDamage());
                getWorld().removeObject(this);
            }
        }
        /*else if(this.isTouching(ButtonHealth.class))
        {
            Upgrade.addHealth(1);
            getWorld().showText("1 Extra Leben", 400, 500);
            getWorld().removeObject(this);
        }
        else if(this.isTouching(ButtonDamage.class))
        {
            Upgrade.addDamage(1);
            getWorld().showText("1 Extra Schaden", 400, 500);
            getWorld().removeObject(this);
        }
        else if(this.isTouching(ButtonNextLvl.class))
        {
            System.out.println(Upgrade.getHealth()+""+Upgrade.getDamage());
            getWorld().removeObject(this);
        } */
    }
}

