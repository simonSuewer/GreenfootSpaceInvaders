import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    
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
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
            Enemy.set_counter(Enemy.get_counter()-1);
            if(Enemy.get_counter()==0)
            {
                Space.set_level(Space.get_level()+1);
                Space x = (Space) getWorld();
                switch(Space.get_level())
                {
                    default:
                        break;
                    case 2:
                        x.initializeLvl2();
                        break;
                    case 3:
                        x.initializeLvl3();
                        break;
                        
                }
                return false;
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
