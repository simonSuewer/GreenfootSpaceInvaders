import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrade extends Actor
{
    static int health=1;
    static int extraDamage=1;
    
   
    
    /**
     * Act - do whatever the Upgrade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
 
    }    
    
    public static void addDamage(int add)
    {
        extraDamage= extraDamage + add;
    }
    
        public static void addHealth(int add)
    {
        health= health + add;
    }
    
        public static void setHealth(int h)
    {
        health= h;
    }
    
    public static int getDamage()
    {
        return extraDamage;
    }
    
       public static int getHealth()
    {
        return health;
    }
}
