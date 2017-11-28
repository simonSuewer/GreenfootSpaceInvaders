import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackgroundMusic
{ 
      private static GreenfootSound soundBackgroundMusic;

      
      private static void playBackgroundMusic(int NumberOfSong) {
          soundBackgroundMusic = new GreenfootSound("backgroundmusic/" + NumberOfSong + ".wav");
        }
        
        
    public void stopped(int level)
    {
      playBackgroundMusic(level);
      soundBackgroundMusic.setVolume(0);  //change bg to what you declared the file as
      soundBackgroundMusic.pause();
    }
    public void started(int level)
    {
       playBackgroundMusic(level);
       soundBackgroundMusic.setVolume(100);    //change bg to what you declared the file as
       soundBackgroundMusic.playLoop();
    }
}
