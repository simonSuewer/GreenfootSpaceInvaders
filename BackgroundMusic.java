import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackgroundMusic
{ 
      private static GreenfootSound soundBackgroundMusic;
      public static void initialSound(int NumberOfSong) {
          soundBackgroundMusic = new GreenfootSound("backgroundmusic/" + NumberOfSong + ".wav");
        }
      
      public void playBackgroundMusic(int NumberOfSong) {
          soundBackgroundMusic.play();
        }
}
