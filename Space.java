import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
   Safegame safegame = new Safegame();
   
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Space()
    {    
        super(800, 800, 1);
        initializeLvl1();
    }
    
    public Object getObjectForLVL()
    {
        
        //switch
        
        return null;
    }
    
    public void initializeLvl1()
    {
        List objects = getObjects(null);
        safegame.setLvl(1);
        if (objects != null) 
        {
            removeObjects(objects); 
        }
        for (int j = 0;j<3;j++)
        {
            for (int i = 0;i<10;i++)
            {
                this.addObject(new Sven(), 110+(64*(i)),50+j*90);
            }
        }
        this.addObject(new Human(),400,750);
            Enemy.set_counter(30);
    }
    public void initializeLvl2()
    {
        List objects = getObjects(null);
        if (objects != null) 
        {
            removeObjects(objects); 
        }
        for (int j = 0;j<3;j++)
        {
            for (int i = 0;i<10;i++)
            {
                this.addObject(new Tim(), 110+(64*(i)),50+j*90);
            }
        }
        this.addObject(new Human(),400,750);
            Enemy.set_counter(30);
    }
    public void initializeLvl3()
    {
        List objects = getObjects(null);
        if (objects != null) 
        {
            removeObjects(objects); 
        }
        for (int j = 0;j<3;j++)
        {
            for (int i = 0;i<10;i++)
            {
                this.addObject(new Lucas(), 110+(64*(i)),50+j*90);
            }
        }
        this.addObject(new Human(),400,750);
            Enemy.set_counter(30);
    }
}
