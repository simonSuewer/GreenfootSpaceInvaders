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
        Safegame safegame = new Safegame();
        if(safegame.getLvl() >= 1)
        {
            initializeLvl(safegame.getLvl());
        }
        else
        {
            safegame.setLvl(1);
            initializeLvl(1);
            //initializeLvl(6, true);
        }
        
    }
   
     public void initializeLvl(int lvl)
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
                switch (lvl) {
                    case 1: 
                             this.addObject(new Sven(), 110+(64*(i)),50+j*90);
                             break;
                    case 2:  
                             this.addObject(new Tim(), 110+(64*(i)),50+j*90);
                             break;
                    case 3:  
                             this.addObject(new Lucas(), 110+(64*(i)),50+j*90);
                             break;
                    case 4:  
                             this.addObject(new Steven(), 110+(64*(i)),50+j*90);
                             break;
                    case 5:  
                             this.addObject(new Max(), 110+(64*(i)),50+j*90);
                             return;
                    default: 
                             return;
                }
                
            }
        }
        this.addObject(new Info(),400,15);
        this.addObject(new Human(),400,750); //das geht so ja eigentlich nicht komplett
        Enemy.set_counter(30);
    }
    
     public void initializeLvl(int lvl, boolean ultra)
    {
        List objects = getObjects(null);
        if (objects != null) 
        {
            removeObjects(objects); 
        }
        for (int j = 0;j<4;j++)
        {
            switch (lvl) {
                    case 6: 
                             this.addObject(new UltraSven(), 110+(183*(j)),140);
                             break;
                    default: 
                             return;
                }
        }
        this.addObject(new Human(),400,750); //das geht so ja eigentlich nicht komplett
        Enemy.set_counter(30);
    }
}
