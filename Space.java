import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Space()
    {    
        super(800, 800, 1);
        initialize();
    }
    
    public void initialize()
    {
        for(int i = 0;i<10;i++)
        {
            this.addObject(new Sven(), 110+(64*(i)),50);
        }
        this.addObject(new Human(),400,750);
    }
}
