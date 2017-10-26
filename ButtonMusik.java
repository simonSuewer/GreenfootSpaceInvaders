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
 
    private Safegame savegame = new Safegame();
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            if(Greenfoot.mouseClicked(this)) {
               if(!savegame.getMusikIsOn()) {
                    savegame.setMusikIsOn(true);
                } else {
                    savegame.setMusikIsOn(false);
                }
                XML.save();
            }
            
            if(savegame.getMusikIsOn()) {
                    setImage("button_musik_off-hover.png");
                } else {
                    setImage("button_musik_on-hover.png");
                }
        }
        else
        {
                if(savegame.getMusikIsOn()) {
                    setImage("button_musik_off.png");
                } else {
                    setImage("button_musik_on.png");
                }
        }
    }  
}
