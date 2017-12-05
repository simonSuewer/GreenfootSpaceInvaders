import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AiEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AiEnemy extends Enemy
{
    /**
     * Act - do whatever the AiEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int destination[] = new int[4];
    private static  int destinationCount = 0;
    private int myDestination;
    private int counter = 0;
    private int shotCount = 0;
    private int dodgeCount = 0;
    
    private final int MAX_DODGE_COUNT = 50;
    private final int MAX_SHOT_COUNT = 10;
    private final int MAX_COUNT = 10;
    
    public void act() 
    {
        if(shotCount != 0) shotCount -= 1;
        if((Greenfoot.getRandomNumber(100) < 2) && (getWorld().getObjects(EnemyShot.class).size())< MAX_SHOT_COUNT)
        {
            getWorld().addObject(new EnemyShot(), getX(), getY()+5);
            shotCount = 30;
        }
        
        
        Human actor = (Human) getWorld().getObjects(Human.class).get(0);
        for(int i = 0; i<4; i++)
        {
            switch(i){
                case 0:
                    destination[i] = actor.getX();
                    break;
                case 1:
                    destination[i] = actor.getX()-100+(Greenfoot.getRandomNumber(200));
                    break;
                case 2:
                    destination[i] = actor.getX()-100+(Greenfoot.getRandomNumber(200));
                    break;
                case 3:
                    destination[i] = actor.getX()-100+(Greenfoot.getRandomNumber(200));
                    break;
            }
        }
        
        if(counter == 0)
        { myDestination = this.getDestination();
            counter = MAX_COUNT;
        }
        else
            counter--;
            
       if(dodgeCount <= 0)
        {
            if(!getObjectsInRange(50, HumanShot.class).isEmpty())
            {
                move(75);
                myDestination = this.getDestination();
                dodgeCount = MAX_DODGE_COUNT;
                
            }
            
       
           // System.out.println(enemyShot);
        }
        else
        {
            dodgeCount--;
            
        
        }
        
        if(myDestination > this.getX() + 20 && (getObjectsInRange(50, HumanShot.class).isEmpty()))
        {
            move(this.getMoveSpeed());
        }
        else if (myDestination < this.getX() - 20 && (getObjectsInRange(50, HumanShot.class).isEmpty()))
        {
            move(this.getMoveSpeed() * (-1));
        }
        else
        {
            myDestination = this.getDestination();
        }
            
       
   
       
    }   
    
    public int getDestination()
    {
        int hold = destinationCount;
        if((destinationCount + 1) == 4)
        {
            destinationCount = 0;
        }
        else
        {
            destinationCount++;
        }
        return this.destination[hold];
    }
    public int getDestionationCount()
    {
        return this.destinationCount;
    }
}
