import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.xml.bind.*;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test extends Actor
{
    /**
     * Act - do whatever the test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        XML test = new XML();
        try{
            test.init();
        } catch (JAXBException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
                
        }
        
        Safegame newSafe = test.read();
        System.out.println("1-->" + newSafe.getCredits());
    }    
}
