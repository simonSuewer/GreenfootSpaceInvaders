import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonMitwirkende here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonMitwirkende extends SettingsActor
{
       private boolean onThis=false;
 
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            setImage("button_mitwirkende-hover.png");
            if(Greenfoot.mouseClicked(this)) {
                Settings settings = new Settings();
                Greenfoot.setWorld(settings);
            }
        }
        else
        {
            setImage("button_mitwirkende.png"); 
        }
    }   
}
