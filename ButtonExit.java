import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonExit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonExit extends MenuActor
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
            setImage("button_exit-hover.png"); 
            if(Greenfoot.mouseClicked(this)) {
                 if(getWorld().getClass().getName() == "Settings" || getWorld().getClass().getName() == "Mitwirkende" || getWorld().getClass().getName() == "GameOver") {
                        if(getWorld().getClass().getName() == "Mitwirkende") {
                            Mitwirkende.soundThugLife.stop();
                        }
                     Menu menu = new Menu();
                     Greenfoot.setWorld(menu);
                 } else if(getWorld().getClass().getName() == "Menu") {
                     System.exit(1);
                 } 
                 if(!SaveGame.getSfxIsOn()) {
                    soundButtonOnClick.play();
                }
            }
        }
        else
        {
            setImage("button_exit.png");
            FirstMouseOn = true;
        }
    }  
}
