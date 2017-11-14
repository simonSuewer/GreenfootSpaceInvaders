import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends World
{
    int damageAdd = 0;
    int healthAdd = 0;    
        
        
    /**
     * Constructor for objects of class Shop.
     * 
     */
    public Shop()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        initial();
    }
    
        public void initial() {
        addObject(new ButtonHealth(), 150, 300);
        addObject(new ButtonDamage(), 415, 300);
        addObject(new ButtonNextLvl(), 675, 300);
        this.addObject(new Human(),400,750);
        this.addObject(new Upgrade(),0,0);
    }
}
