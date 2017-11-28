import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeShot extends HumanShot
{
    private static final int SHOT_SPEED = 5;
    Safegame safegame = new Safegame();
    public UpgradeShot()
    {
        super();
    }
    
    public void act() 
    {
        this.move(SHOT_SPEED);
        getWorld().showText("", 400, 500);
        if(this.atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else if(this.isTouching(ButtonHealth.class))
        {
            if(safegame.getCredits() >= (safegame.getUpgrade().getHealth() * safegame.getPIRICE_FIRST()))
            {
                getWorld().showText("1 Extra Leben", 400, 500);
                getWorld().removeObject(this);
                safegame.setCredits(safegame.getCredits()-(safegame.getUpgrade().getHealth() * safegame.getPIRICE_FIRST()));
                safegame.getUpgrade().addHealth(1);
            }
            else
            {
                getWorld().showText("Ihnen fehlen " + (safegame.getUpgrade().getHealth() * safegame.getPIRICE_FIRST() - safegame.getCredits()) + " Credits", 400, 500);
            }
        }
        else if(this.isTouching(ButtonDamage.class))
        {
            if(safegame.getCredits() >= (safegame.getUpgrade().getDamage() * safegame.getPIRICE_FIRST()))
            {
                getWorld().showText("1 Extra Schaden", 400, 500);
                getWorld().removeObject(this);
                safegame.setCredits(safegame.getCredits()-(safegame.getUpgrade().getDamage() * safegame.getPIRICE_FIRST()));
                safegame.getUpgrade().addDamage(1);
            }
            else
            {
                getWorld().showText("Ihnen fehlen " + (safegame.getUpgrade().getDamage() * safegame.getPIRICE_FIRST() -safegame.getCredits()) + " Credits", 400, 500);
            }
        }
        else if(this.isTouching(ButtonNextLvl.class))
        {
            Space space = new Space();
            getWorld().removeObject(this);
            Greenfoot.setWorld(space);
        } 
    }    
}