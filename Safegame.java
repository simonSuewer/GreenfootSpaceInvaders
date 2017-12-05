import javax.xml.bind.annotation.*;

@XmlRootElement
public class Safegame  
{
    // instance variables - replace the example below with your own
    private static int lvl;
    private static int credits;
    private static Upgrade upgrades;
    private static int score;
    private static boolean MusikIsOn = true;
    private static boolean SfxIsOn = true;
    private static final int BASE_MOVE_SPEED = 5;
    private static final int BASE_SHOT_SPEED = 5;
    private static final int PIRICE_FIRST = 20;
    
    public Safegame()
    {
    }
    
    
    //getter
     public static int getPIRICE_FIRST()
    {
        return PIRICE_FIRST;
    }
     public static int getBASE_MOVE_SPEED()
    {
        return BASE_MOVE_SPEED + lvl;
    }
     public static int getBASE_SHOT_SPEED()
    {
        return BASE_SHOT_SPEED + lvl;
    }
    public int getLvl()
    {
        return lvl;
    }
    public int getCredits()
    {
        return credits;
    }
    public int getScore()
    {
        return score;
    }
    public Upgrade getUpgrade()
    {
        return upgrades;
    }
    public boolean getMusikIsOn()
    {
        return MusikIsOn;
    }
    public boolean getSfxIsOn()
    {
        return SfxIsOn;
    }
    
    //setter
    public void setLvl(int lvl)
    {
        this.lvl = lvl;
        save();
    }
    public void setCredits(int credits)
    {
        this.credits = credits;
        save();
    }
    public void setScore(int score)
    {
        this.score = score;
        save();
    }
    public void setUpgrade(Upgrade upgrades)
    {
        this.upgrades = upgrades;
        save();
    }
    public void setMusikIsOn(boolean MusikIsOn)
    {
        this.MusikIsOn = MusikIsOn;
        save();
    }
    public void setSfxIsOn(boolean SfxIsOn)
    {
        this.SfxIsOn = SfxIsOn;
        save();
    }
    
    private void save()
    {
        XML data = new XML();
        data.save();
    }
    
    public void reset()
    {
        XML data = new XML();
        data.init();
    }
    
}
