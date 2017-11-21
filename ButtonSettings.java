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
       private GreenfootSound soundButtonOnHover = new GreenfootSound("button_onHover.wav");
       private GreenfootSound soundButtonOnClick = new GreenfootSound("button_onClick.wav"); 
       private boolean FirstMouseOn = true;
       private Safegame SaveGame = new Safegame();
 
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            if(FirstMouseOn && !SaveGame.getSfxIsOn()) {
                soundButtonOnHover.play();
                FirstMouseOn = false;
            }
            setImage("button_settings-hover.png");
            if(Greenfoot.mouseClicked(this)) {
                if(!SaveGame.getSfxIsOn()) {
                    soundButtonOnClick.play();
                }
                Settings settings = new Settings();
                Greenfoot.setWorld(settings);
            }
        }
        else
        {
            setImage("button_settings.png");
            FirstMouseOn = true;
        }
    }  
}
