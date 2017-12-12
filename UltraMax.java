import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UltraMax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltraMax extends UltraEnemy
{
     private int shotCount = 0;
    private int max_shot = 7;
    
    public void act() 
    {
       //shot
        if(shotCount != 0) shotCount -= 1;
        if((Greenfoot.getRandomNumber(100) < 3) && (getWorld().getObjects(EnemyShot.class).size())< max_shot)
        {
            getWorld().addObject(new EnemyShot(), getX()-200+(Greenfoot.getRandomNumber(400)), getY()+5);
            shotCount = 30;
        }
        
        if((Greenfoot.getRandomNumber(100) < 2) && (getWorld().getObjects(EnemyRocket.class).size())< 2)
        {
            getWorld().addObject(new EnemyRocket(), getX(), getY()+5);
            shotCount = 30;
        }
        move(this.getMoveSpeed());
       if(this.getX() >= 580 || this.getX() <= 220)
        {
            if(this.getMoveSpeed()>0)
            {
                getWorld().getObjects(Enemy.class).get(0).setMoveSpeed(getWorld().getObjects(Enemy.class).get(0).getMoveSpeed()*(-1));
                //getWorld().getObjects(Enemy.class).get(i).move(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed());

            }
            else
            {
                getWorld().getObjects(Enemy.class).get(0).setMoveSpeed(getWorld().getObjects(Enemy.class).get(0).getMoveSpeed()*(-1));
                //getWorld().getObjects(Enemy.class).get(i).move(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed());
            }
        }
    } 
}
