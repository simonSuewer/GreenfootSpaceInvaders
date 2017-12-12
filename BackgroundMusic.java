import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class BackgroundMusic
{ 
      private static GreenfootSound soundBackgroundMusic;
      private Safegame savegame = new Safegame(); 

      
      private static void playBackgroundMusic() {
          Random r = new Random();
          int randomNumber = r.nextInt(6) + 1;
    try
    {
        soundBackgroundMusic = new GreenfootSound("backgroundmusic/" + randomNumber + ".mp3");
    } catch (Exception e) {
        System.out.println("Background-Musik konnte nicht geladen werden");
    }
        }
        
        
    public void stopped()
    {
      playBackgroundMusic();
      soundBackgroundMusic.setVolume(0);  //change bg to what you declared the file as
      soundBackgroundMusic.pause();
    }
    public void started()
    {
        if(!savegame.getMusikIsOn()) {
           playBackgroundMusic();
           soundBackgroundMusic.setVolume(100);    //change bg to what you declared the file as
           soundBackgroundMusic.playLoop();
    }
    }
}
