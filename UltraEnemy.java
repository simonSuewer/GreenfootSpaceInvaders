import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UltraEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UltraEnemy extends Ship
{
    private int shotCount = 0;
    private int max_shot = 10;
    private int health;
    private boolean changeVertikal = true;
    private boolean change = false;
    private int newCounter = 40;
    
    public UltraEnemy()
    {
        super();
        Safegame load = new Safegame();
        this.health = load.getLvl() * load.getLvl();
    }
    
    public void act() 
    {
        //shot
        if(shotCount != 0) shotCount -= 1;
        if((Greenfoot.getRandomNumber(100) < 1) && (getWorld().getObjects(EnemyShot.class).size())< max_shot)
        {
            getWorld().addObject(new EnemyShot(), getX(), getY()+5);
            shotCount = 20;
        }
        
       if(Greenfoot.getRandomNumber(100) > 95)
       {
           
           if(changeVertikal)
           {
              if(change) turn(270);
              else turn(90);
               changeVertikal = false;
           }
           else
           {
               turn(270);
               if(getY() <= 10 || getY() >= 790 )
               {
                   turn(180);
                   change = true;
                }
                else
                {
                    change = false;
                }
               changeVertikal = true;
           }
       }
       
       if((Greenfoot.getRandomNumber(100)) >= 95)
       {
           if(newCounter == 0)
           {
               newCounter = 40;
               getWorld().addObject(new UltraSven(), 110+(Greenfoot.getRandomNumber(740)),140);
           }
           else{
               newCounter -= 1;
           }
            
       
       }
       
       if(getY() >= 750)
       {
           getWorld().removeObject(this);
       }
        
      move(1);
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
