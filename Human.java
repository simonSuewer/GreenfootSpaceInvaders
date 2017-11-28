import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Ship
{
    // private static int health = 5; ist jetzt in Upgrades
    private int shotCount = 0;
    private static Safegame safegame = new Safegame();
    private GreenfootSound soundHorn = new GreenfootSound("horn.wav");
    private GreenfootSound shotSound1 = new GreenfootSound("shot1.wav");
    

    public Human()
    {
        super();
        
        //this.health = load.getUpgrade().getHealth();
        this.setMoveSpeed(5);
    }

    public void act() 
    {
        switch(getHealth()){
            case 1: 
                setImage("eigenesSchiff_1.png");
            break;
            case 2: 
                setImage("eigenesSchiff_2.png");
            break;
            case 3: 
                setImage("eigenesSchiff_3.png");
            break;
            case 4: 
                setImage("eigenesSchiff_4.png");
            break;
            case 5: 
                setImage("eigenesSchiff.png");
            break;
            case 6: 
                setImage("eigenesSchiff_6.png");
            break;
            case 7: 
                setImage("eigenesSchiff_7.png");
            break;
            case 8: 
                setImage("eigenesSchiff_8.png");
            break;
            case 9: 
                setImage("eigenesSchiff_9.png");
            break;
        }
        
        //move left
        if(Greenfoot.isKeyDown("a"))
        {
            this.move(this.getMoveSpeed() * (-1));
        }
        //move right
        if(Greenfoot.isKeyDown("d"))
        {
            this.move(this.getMoveSpeed());
        }
        
        if(Greenfoot.isKeyDown("h"))
        {
            soundHorn.play();
        }
        
        //shot
        if(shotCount != 0) shotCount -= 1;
        
        if(Greenfoot.isKeyDown("space"))
        {
            if(shotCount == 0)
            {
                shotCount = 30;
                getWorld().addObject(new HumanShot(), getX(), getY()+5);
                if(!safegame.getSfxIsOn()) {
                shotSound1.play();
                }
                
            }
        }
    }    
    
    public static int getHealth()
    {
        return safegame.getUpgrade().getHealth();
    }
    public static void setHealth(int h)
    {
       safegame.getUpgrade().setHealth(h);
    }
}
