import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    private Safegame safegame = new Safegame();
    private GreenfootImage gif =  new GreenfootImage("grafik_explosion.png");
        
        
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    public boolean hit(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, Enemy.class);
        System.out.println(actor);
        if(actor != null) {
            getWorld().removeObject(actor);
            Enemy.set_counter(Enemy.get_counter()-1);
            if(getWorld().getObjects(Enemy.class).isEmpty())
            {
                safegame.setLvl(safegame.getLvl()+1);
                Shop x = new Shop();
                Greenfoot.setWorld(x);
            }
            return true;
        }
        return false;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
