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
<<<<<<< HEAD
            
                this.move(this.get_moveSpeed() * (-1));
            
=======
                this.move(this.get_moveSpeed() * (-1));
>>>>>>> 64c5493d8ff3c9601db86b02e552f0920731e87c
        }
        //move right
        if(Greenfoot.isKeyDown("d"))
        {
<<<<<<< HEAD
              this.move(this.get_moveSpeed());
            
=======
                this.move(this.get_moveSpeed());
>>>>>>> 64c5493d8ff3c9601db86b02e552f0920731e87c
        }
    }    
}
