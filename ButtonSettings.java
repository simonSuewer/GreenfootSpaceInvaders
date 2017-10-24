import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonSettings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonSettings extends MenuActor
{
       private boolean onThis=false;
 
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            setImage("button_settings-hover.png");
            if(Greenfoot.mouseClicked(this)) {
                Settings settings = new Settings();
                Greenfoot.setWorld(settings);
            }
        }
        else
        {
            setImage("button_settings.png"); 
        }
    }  
}
