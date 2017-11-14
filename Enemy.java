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
    private int shotCount = 0;
    private int max_shot = 5;
    private int health;
    
    public Enemy()
    {
        super();
        Safegame load = new Safegame();
        this.health = load.getLvl() * load.getLvl();
    }
    
    public static int get_counter()
    {
        return counter;
    }

    //setter
    public static void set_counter(int newCounter)
    {
        counter = newCounter;
    }


    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //shot
        if(shotCount != 0) shotCount -= 1;
        if((Greenfoot.getRandomNumber(100) < 1) && (getWorld().getObjects(EnemyShot.class).size())< max_shot)
        {
            getWorld().addObject(new EnemyShot(), getX(), getY()+5);
            shotCount = 30;
        }
        
        // Add your action code here.
       move(this.getMoveSpeed());
       if(this.isAtEdge())
        {
            if(this.getMoveSpeed()>0)
            {
                for (int i = counter-1;i>=0;i--)
            {
                getWorld().getObjects(Enemy.class).get(i).setMoveSpeed(getWorld().getObjects(Enemy.class).get(i).getMoveSpeed()*(-1));
                //getWorld().getObjects(Enemy.class).get(i).move(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed());
            }
        }
        else
        {
            for (int i = 0;i<counter;i++)
            {
                getWorld().getObjects(Enemy.class).get(i).setMoveSpeed(getWorld().getObjects(Enemy.class).get(i).getMoveSpeed()*(-1));
                //getWorld().getObjects(Enemy.class).get(i).move(getWorld().getObjects(Enemy.class).get(i).get_moveSpeed());
            }
            this.move(this.getMoveSpeed()+1);
        }
        //this.move(this.get_moveSpeed());
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
