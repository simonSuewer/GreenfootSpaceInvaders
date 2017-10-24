import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonMusik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonMusik extends SettingsActor
{
private boolean onThis=false;
 
    int statusMusikIsActivated = 0;
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            if(Greenfoot.mouseClicked(this)) {
               if(statusMusikIsActivated == 0) {
                    statusMusikIsActivated = 1;
                } else {
                    statusMusikIsActivated = 0;
                }
            }
            
            if( statusMusikIsActivated == 1) {
                    setImage("button_musik_off-hover.png");
                } else {
                    setImage("button_musik_on-hover.png");
                }
        }
        else
        {
                if( statusMusikIsActivated == 1) {
                    setImage("button_musik_off.png");
                } else {
                    setImage("button_musik_on.png");
                }
        }
    }  
}
