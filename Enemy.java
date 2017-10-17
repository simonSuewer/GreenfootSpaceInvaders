import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Ship
{
    private static int counter = 30;
    
    public static int get_counter()
    {
        return counter;
    }

    //setter
    public static void set_counter(int counterr)
    {
        counter = counterr;
    }
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
            move(this.get_moveSpeed());
       if(this.isAtEdge())
        {
            if(this.get_moveSpeed()>0)
            {
                for (int i = counter-1;i>=0;i--)
            {
                getWorld().getObjects(Enemy.class).get(i).set_moveSpeed(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed()*(-1));
                //getWorld().getObjects(Enemy.class).get(i).move(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed());
            }
        }
        else
        {
            for (int i = 0;i<counter;i++)
            {
                getWorld().getObjects(Enemy.class).get(i).set_moveSpeed(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed()*(-1));
                //getWorld().getObjects(Enemy.class).get(i).move(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed());
            }
            this.move(this.get_moveSpeed()+1);
        }
        //this.move(this.get_moveSpeed());
        }
    }    
}
