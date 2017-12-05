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
    private static int destination[] = new int[140];
    private static  int destinationCount = 0;
    private int myDestination;
    private int counter;
    public void act() 
    {
        // Add your action code here.
        System.out.println("test");
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
        System.out.println(destination.toString());
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
