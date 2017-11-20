import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop extends World
{
    int damageAdd = 0;
    int healthAdd = 0;    
    /**
     * Constructor for objects of class Shop.
     */
    public Shop()
    {    
        super(800, 800, 1); 
        initial();
    }
    
        public void initial() {
        showText("??? Credit = 1 Extra Leben", 150, 175);
        addObject(new ButtonHealth(), 150, 300);
        showText("??? Credit = 1 Extra Schaden", 415, 175);
        addObject(new ButtonDamage(), 415, 300);
        showText("Ins nächste Level", 675, 175);
        addObject(new ButtonNextLvl(), 675, 300);
        this.addObject(new UpgradeShip(),400,750);
        this.addObject(new Upgrade(),0,0);
    }
}