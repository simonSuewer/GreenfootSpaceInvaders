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
            if(!this.atWorldEdge())
            {
                this.move(this.get_moveSpeed() * (-1));
            }
        }
        //move right
        if(Greenfoot.isKeyDown("d"))
        {
            if(!this.atWorldEdge())
            {
                this.move(this.get_moveSpeed());
            }
        }
    }    
}
