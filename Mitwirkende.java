import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mitwirkende here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mitwirkende extends World
{

    private GreenfootSound soundThugLife = new GreenfootSound("thuglife.wav"); 

    
    public Mitwirkende()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        soundThugLife.play();
        showText("MITWIRKENDE", 400, 20);
        
        showText("Software-Engineer:", 400, 100);
        showText("Simon Süwer", 400, 120);
        showText("Tim Hase", 400, 140);
        showText("Lucas Reich", 400, 160);
        showText("Max Beckmann", 400, 180);
        showText("Steven Streller", 400, 200);
        
        showText("Grafik-Engineer:", 400, 300);
        showText("Simon Süwer", 400, 320);
        showText("Tim Hase", 400, 340);
        showText("Lucas Reich", 400, 360);
        showText("Max Beckmann", 400, 380);
        showText("Steven Streller", 400, 400);
        
        showText("Sound-Engineer:", 400, 500);
        showText("Simon Süwer", 400, 520);
        showText("Tim Hase", 400, 540);
        showText("Lucas Reich", 400, 560);
        showText("Max Beckmann", 400, 580);
        showText("Steven Streller", 400, 600);
        
        
        addObject(new ButtonExit(), 400, 700);
    }
    
    
}
