import greenfoot.*;
import java.util.Random;
/**
 * Write a description of class ActionSounds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ActionSounds  
{
    public static void playShotSound() {
        GreenfootSound shotSound1 = new GreenfootSound("shot1.wav");
        GreenfootSound shotSound2 = new GreenfootSound("shot2.wav");
        
        Random random = new Random();
        
        if(random.nextBoolean()) {
            shotSound1.play();
        } else {
            shotSound2.play();
        }
        
    }
    
    public static void playHitmarkerSound() {
    GreenfootSound hitmarkerSound = new GreenfootSound("hitmarker.wav");
    hitmarkerSound.play();
    }
}
