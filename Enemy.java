import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Ship
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(this.get_moveSpeed());
        if(this.isAtEdge())
        {
            this.set_moveSpeed(this.get_moveSpeed()*(-1));
        }
        else if(this.getObjectsInRange(58, Enemy.class).toString()!="[]")
        {
            this.set_moveSpeed(this.get_moveSpeed()*(-1));
            move(this.get_moveSpeed());
        }
    }    
}
