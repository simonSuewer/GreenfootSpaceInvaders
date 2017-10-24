import javax.xml.bind.annotation.*;

@XmlRootElement
public class Safegame  
{
    // instance variables - replace the example below with your own
    private int lvl;
    private int credits;
    private Upgrade upgrades;
    private int score;
    
    
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
    
    
    
}