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
    
    
    public Safegame()
    {
    }
    
    
    //getter
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
    }
    public void setCredits(int credits)
    {
        this.credits = credits;
    }
    public void setScore(int score)
    {
        this.score = score;
    }
    public void setUpgrade(Upgrade upgrades)
    {
        this.upgrades = upgrades;
    }
    public void setMusikIsOn(boolean MusikIsOn)
    {
        this.MusikIsOn = MusikIsOn;
    }
    public void setSfxIsOn(boolean SfxIsOn)
    {
        this.SfxIsOn = SfxIsOn;
    }
    
    
    
}
