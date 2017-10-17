import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends World
{
    MouseInfo mouseInfo;
    
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1);
        initial();
        int button, mouseY, mouseX = 0;
         MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null){
            button = mouse.getButton();
            if(button == 1 && Greenfoot.mouseClicked(null)) //Add this else it will be transferred to your mouse all the time, now just when you click.
            {
            mouseX=mouse.getX();
            mouseY=mouse.getY();
            }
            System.out.println(mouseX);
        }
        
    }     
    
    public void initial() {
        addObject(new BackgroundHeader(), 400, 125);
        addObject(new ButtonStart(), 400, 500);
        addObject(new ButtonSettings(), 400, 600);
        addObject(new ButtonExit(), 400, 700);
    }
}
