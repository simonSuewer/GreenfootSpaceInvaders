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
        setImage("grafik_schuss_"+safegame.getUpgrade().getDamage()+".png");
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
            
            if(actor.getHealth() <= (safegame.getLvl() * safegame.getLvl() / 2))
            {
                actor.setImage("grafik_gegner_level" + safegame.getLvl() + "_schaden.png");
            }
            
        }
        
        
    }
}

