import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackgroundMusic
{ 
      private static GreenfootSound soundBackgroundMusic;
      private Safegame savegame = new Safegame(); 

      
      private static void playBackgroundMusic(int NumberOfSong) {
          try {
          if(NumberOfSong > 5) {
            soundBackgroundMusic = new GreenfootSound("backgroundmusic/" + NumberOfSong + ".mp3");
        } else {
            soundBackgroundMusic = new GreenfootSound("backgroundmusic/" + 1 + ".mp3");
        }
    } catch (Exception e) {
        System.out.println("Background-Musik konnte nicht geladen werden");
    }
        }
        
        
    public void stopped(int level)
    {
      playBackgroundMusic(level);
      soundBackgroundMusic.setVolume(0);  //change bg to what you declared the file as
      soundBackgroundMusic.pause();
    }
    public void started(int level)
    {
        if(!savegame.getMusikIsOn()) {
           playBackgroundMusic(level);
           soundBackgroundMusic.setVolume(100);    //change bg to what you declared the file as
           soundBackgroundMusic.playLoop();
    }
    }
}
