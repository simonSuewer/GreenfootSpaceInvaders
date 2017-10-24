import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonExit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonExit extends MenuActor
{
       private boolean onThis=false;
 
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            setImage("button_exit-hover.png"); 
            if(Greenfoot.mouseClicked(this)) {
                System.exit(1);
            }
        }
        else
        {
            setImage("button_exit.png"); 
        }
    }  
}
