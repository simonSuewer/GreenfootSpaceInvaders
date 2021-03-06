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
    private Safegame safegame = new Safegame();
    private GreenfootSound hitmarkerSound = new GreenfootSound("hitmarker.wav");

  
    
    public HumanShot()
    {
        super();
        this.turn(-90);
    }
    public void act() 
    {
        if(safegame.getUpgrade().getDamage()>13)
        {
            setImage("grafik_schuss_13.png");
        }
        else
        {
            setImage("grafik_schuss_"+safegame.getUpgrade().getDamage()+".png");
        }
        this.move(SHOT_SPEED);
        Enemy actor = (Enemy) getOneObjectAtOffset(0, 0, Enemy.class);
        if(this.atWorldEdge())
        {
            getWorld().removeObject(this);
        }
        else if(actor != null)
        {
            if(!safegame.getSfxIsOn()) {
                hitmarkerSound.play();
            }
            
            safegame.setScore(safegame.getScore() + safegame.getLvl() * safegame.getLvl());
            
            if(actor.getHealth() <= safegame.getUpgrade().getDamage())
            {
                 this.hit(Enemy.class); 
                 getWorld().removeObject(this);
                 safegame.setCredits(safegame.getCredits() + safegame.getLvl() * safegame.getLvl());                
            }
            else
            {
                actor.setHealth(actor.getHealth() - safegame.getUpgrade().getDamage());
                getWorld().removeObject(this);
            }
            
            if(actor.getHealth() <= (safegame.getLvl() * safegame.getLvl() / 2))
            {
                if(safegame.getLvl() <= 5)
                actor.setImage("grafik_gegner_level" + safegame.getLvl() + "_schaden.png");
                else if(safegame.getLvl() >5 && safegame.getLvl() <= 10)
                actor.setImage("grafik_gegner_level" + (safegame.getLvl() - 5) + "_schaden.png");
                else if(safegame.getLvl() >10 && safegame.getLvl() <= 15)
                actor.setImage("grafik_gegner_level" + (safegame.getLvl() - 10) + "_schaden.png");
            }
            
        }
        
        
    }
}

