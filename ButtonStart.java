import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonStart extends MenuActor
{
       private boolean onThis=false;
 
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            System.out.println("Hover");
            setImage("button_start-hover.png"); 
        }
        else
        {
            System.out.println("notHover");
            setImage("button_start.png"); 
        }
    }
 }    

