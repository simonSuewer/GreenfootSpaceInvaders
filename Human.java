import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Ship
{
    
    private Upgrade upgrade = new Upgrade();
    
 
    public void act() 
    {
        //move left
        if(Greenfoot.isKeyDown("a"))
        {
            
                this.move(this.get_moveSpeed() * (-1));
            
        }
        //move right
        if(Greenfoot.isKeyDown("d"))
        {
              this.move(this.get_moveSpeed());
            
        }
    }    
}
