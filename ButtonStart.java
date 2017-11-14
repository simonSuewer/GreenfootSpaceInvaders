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
            setImage("button_start-hover.png");
            
            if(Greenfoot.mouseClicked(this)) {
                if (!saveGame.getSfxIsOn()) {
                soundButtonOnClick.play();
                }
                Space space = new Space();
                Greenfoot.setWorld(space);
            }
        }
        else
        {
            setImage("button_start.png");
            FirstMouseOn = true;
        }
    }
 }    

