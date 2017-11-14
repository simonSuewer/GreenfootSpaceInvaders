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
 
    private Safegame savegame = new Safegame();
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            if(Greenfoot.mouseClicked(this)) {
               if(!savegame.getSfxIsOn()) {
                    savegame.setSfxIsOn(true);
                } else {
                    savegame.setSfxIsOn(false);
                }
                XML.save();
            }
            
            if(savegame.getSfxIsOn()) {
                    setImage("button_sfx-sounds_off-hover.png");
                } else {
                    setImage("button_sfx-sounds-hover.png");
                }
        }
        else
        {
                if(savegame.getSfxIsOn()) {
                    setImage("button_sfx-sounds_off.png");
                } else {
                    setImage("button_sfx-sounds.png");
                }
        }
    }  
}
