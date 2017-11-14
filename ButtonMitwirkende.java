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
       private GreenfootSound soundButtonOnHover = new GreenfootSound("button_onHover.wav");
       private GreenfootSound soundButtonOnClick = new GreenfootSound("button_onClick.wav"); 
       private boolean FirstMouseOn = true;
       private Safegame saveGame = new Safegame();
 
    public void act() {
        if(Greenfoot.mouseMoved(null))
            onThis = Greenfoot.mouseMoved(this);
        if(onThis)
        {
            if(FirstMouseOn) {
                if (!saveGame.getSfxIsOn()) {
                soundButtonOnHover.play();
                FirstMouseOn = false;
                }
            }
            
            setImage("button_mitwirkende-hover.png");
            if(Greenfoot.mouseClicked(this)) {
                if (!saveGame.getSfxIsOn()) {
                soundButtonOnClick.play();
            }
                Mitwirkende mitwirkende = new Mitwirkende();
                Greenfoot.setWorld(mitwirkende);
            }
        }
        else
        {
            setImage("button_mitwirkende.png"); 
            FirstMouseOn = true;
        }
    }   
}
