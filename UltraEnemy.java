import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UltraEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltraEnemy extends Enemy
{
    private int shotCount = 0;
    private int max_shot = 10;
    private int health;
    private boolean changeVertical = true;
    private boolean changeHorizontal = false;
    private int newCounter = 40;
    
    public UltraEnemy()
    {
        super();
        Safegame load = new Safegame();
        this.health = load.getLvl() * load.getLvl();
        if((Greenfoot.getRandomNumber(2)) == 1)
        {
           changeHorizontal=!changeHorizontal; 
        }
    }
    
    public void act() 
    {
        //System.out.println(!getWorld().getObjects(Enemy.class).isEmpty());
        //shot
        if(shotCount != 0) shotCount -= 1;
        if((Greenfoot.getRandomNumber(100) < 1) && (getWorld().getObjects(EnemyShot.class).size())< max_shot)
        {
            getWorld().addObject(new EnemyShot(), getX(), getY()+5);
            shotCount = 20;
        }
        
       if(Greenfoot.getRandomNumber(100) > 95)
       {
           
           if(changeVertical)
           {
               turn(90);
               changeVertical = false;
           }
           else
           {
               turn(270);
               changeVertical = true;
           }
       }
       
       if((Greenfoot.getRandomNumber(100)) >= 95)
       {
           if(newCounter == 0)
           {
               newCounter = 40;
               getWorld().addObject(new UltraSven(), 110+(Greenfoot.getRandomNumber(580)),140);
           }
           else{
               newCounter -= 1;
           }
            
       
       }
       
       
       
       if((getX() >= 750 || getX() <= 50) && !(getY() >= 750) )
       {
            changeHorizontal=!changeHorizontal;
       }
       
       if(getY() >= 750)
       {
           getWorld().removeObject(this);
       }
        
       
      if(changeVertical)
      {
        if(Greenfoot.getRandomNumber(100) >= 98)
        {
            changeHorizontal=!changeHorizontal;
        }
        if(!changeHorizontal)
        move(1);
        else
        move(-1);
      }
      else
      {
          move(1);
      }
    }    
    
   
    public int getHealth()
    {
        return this.health;
    }
    public void setHealth(int h)
    {
        this.health = h;
    }   
}
