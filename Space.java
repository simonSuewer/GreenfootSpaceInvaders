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
   private BackgroundMusic backgroundMusic = new BackgroundMusic();
   
    
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
            if(safegame.getLvl()<=5)
            {
                initializeLvl(safegame.getLvl());
            }
            else if (safegame.getLvl()>5 && safegame.getLvl() <=10)
            {
                initializeLvl(safegame.getLvl(), true);
            }
            else if (safegame.getLvl()>10)
            {
                initializeLvl(safegame.getLvl(), true, true);
            }
            
        }
        else
        {
            safegame.setLvl(5);
            initializeLvl(5);
            //initializeLvl(6, true);
            //initializeLvl(11,true,true);
        }
        
    }
   
     public void initializeLvl(int lvl)
    {
        List objects = getObjects(null);
        backgroundMusic.started(lvl);
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
                             this.addObject(new Sven(), 110+(64*(i)), 50+j*90);
                             break;
                    case 2:  
                             this.addObject(new Tim(), 110+(64*(i)), 50+j*90);
                             break;
                    case 3:  
                             this.addObject(new Lucas(), 110+(64*(i)), 50+j*90);
                             break;
                    case 4:  
                             this.addObject(new Steven(), 110+(64*(i)), 50+j*90);
                             break;
                    case 5:  
                             this.addObject(new Max(), 400, 50);
                             spawnHuman();
                             return;
                    default: 
                             return;
                }
                
            }
        }
        spawnHuman();
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
                         this.addObject(new UltraSven(), 110+(183*(j)), 140);
                         break;
                    case 7: 
                         this.addObject(new UltraLucas(), 110+(183*(j)), 140);
                         break;
                    case 8: 
                         this.addObject(new UltraSteven(), 110+(183*(j)), 140);
                         break;
                    case 9: 
                         this.addObject(new UltraTim(), 110+(183*(j)), 140);
                         break;
                    case 10: 
                         this.addObject(new UltraMax(), 400, 140);
                         spawnHuman();
                         return;
                    default: 
                             return;
                }
        }
        spawnHuman();
    } 
    public void initializeLvl(int lvl, boolean ultra, boolean ai)
    {
        List objects = getObjects(null);
        if (objects != null) 
        {
            removeObjects(objects); 
        }
        for (int j = 0;j<4;j++)
        {
            switch (lvl) {
                    case 11: 
                         this.addObject(new AiSteven(), 110+(183*(j)), 50+(60*j));
                         break;
                    case 12: 
                         this.addObject(new AiLucas(), 110+(183*(j)), 50+(60*j));
                         break;
                    case 13: 
                         this.addObject(new AiSven(), 110+(183*(j)), 50+(60*j));
                         break;
                    case 14: 
                         this.addObject(new AiTim(), 110+(183*(j)), 50+(60*j));
                         break;
                    case 15: 
                         this.addObject(new AiMax(), 400, 50);
                         spawnHuman();
                         return;
                    default: 
                             return;
                }
        }
        spawnHuman();
    }
    
    public void spawnHuman()
    {
        this.addObject(new Human(),400,750); //das geht so ja eigentlich nicht komplett
        this.addObject(new Info(),400,15);       
        Enemy.set_counter(30);
    }
}
