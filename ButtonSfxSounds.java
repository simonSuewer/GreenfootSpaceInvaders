import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonSfxSounds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonSfxSounds extends SettingsActor
{
private boolean onThis=false;
 
    int statusSfxIsActivated = 0;
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            if(Greenfoot.mouseClicked(this)) {
               if(statusSfxIsActivated == 0) {
                    statusSfxIsActivated = 1;
                } else {
                    statusSfxIsActivated = 0;
                }
            }
            
            if( statusSfxIsActivated == 1) {
                    setImage("button_sfx-sounds_off-hover.png");
                } else {
                    setImage("button_sfx-sounds-hover.png");
                }
        }
        else
        {
                if( statusSfxIsActivated == 1) {
                    setImage("button_sfx-sounds_off.png");
                } else {
                    setImage("button_sfx-sounds.png");
                }
        }
    }  
}
