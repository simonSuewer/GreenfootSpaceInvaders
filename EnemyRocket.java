import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyRocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyRocket extends Weapon
{
    private Safegame safegame = new Safegame();
    private Human player;
    
    
    public EnemyRocket()
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
            return;
        }
        else if(this.isTouching(Human.class))
        {
            if(Human.getHealth() <= 3)
            {
                this.hit(Human.class); 
                getWorld().removeObject(this);
                GameOver gameOver = new GameOver();
                Greenfoot.setWorld(gameOver);
            }
            else
            {
                Human.setHealth(Human.getHealth() -3);
                getWorld().removeObject(this);
                return;
            }
            
          
        }
        
          if(getY() < 550)
            {
               player = (Human) getWorld().getObjects(Human.class).get(0);
               System.out.println(player.toString());
               turnTowards(player.getX(), player.getY());
            }
            
    }   
}
