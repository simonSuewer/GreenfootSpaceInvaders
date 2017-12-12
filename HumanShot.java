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
    private GreenfootImage gif =  new GreenfootImage("grafik_explosion.png");;
    private int timer =4;
    
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
               
                if (timer == 4)   
                {   
                     this.setImage(gif);  
                     this.getImage().scale(10,10);
                }
                if(timer == 3)
                {
                     this.getImage().scale(20,20);
                }
                if(timer == 2)
                {
                     this.getImage().scale(30,30);
                }
                if(timer == 1)
                {
                     this.getImage().scale(40,40);
                }
                if(timer == 0) {  
                     this.hit(Enemy.class); 
                     safegame.setCredits(safegame.getCredits() + safegame.getLvl() * safegame.getLvl());
                }
                
                
                
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

