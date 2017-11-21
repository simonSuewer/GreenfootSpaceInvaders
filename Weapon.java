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
                safegame.setLvl(safegame.getLvl()+1);
                Space x = (Space) getWorld();
                switch(safegame.getLvl())
                {
                    default:
                        break;
                    case 2:
                        x.initializeLvl(2);
                        break;
                    case 3:
                        x.initializeLvl(3);
                        break;
                    case 4:
                        x.initializeLvl(4);
                        break;
                    case 5:
                        x.initializeLvl(5);
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
