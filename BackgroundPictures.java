import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BackgroundPictures 
{
    public static void setBackground(World w, int level) {
        if(level >= 0 && level < 4) {
        w.setBackground(new GreenfootImage("backgrounds/1.png"));
        } else if(level > 4 && level < 9) {
        w.setBackground(new GreenfootImage("backgrounds/2.png"));
        } else {
        w.setBackground(new GreenfootImage("backgrounds/3.png"));
        }
    }
}