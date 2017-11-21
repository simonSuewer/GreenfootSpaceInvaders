import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import javax.xml.bind.*;

public class XML  
{
    
    
    public static final String path = "save.xml";
    
    public XML()
    {
    }

    public static Safegame read()
    {
       
        File file = new File( path );
        Safegame read  = JAXB.unmarshal( file, Safegame.class );
        return read;
    }
    public static void init() 
    {
        Safegame write = new Safegame();
        
        write.setLvl(1);
        write.setCredits(0);
        write.setScore(0);
        write.getUpgrade().setHealth(5);
        write.getUpgrade().setDamage(1);
        save();
        
        
    }
    
    public static void save()
    {
        Safegame write = new Safegame();

        File file = new File( path );
        
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Safegame.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //jaxbMarshaller.marshal(write, System.out);
            jaxbMarshaller.marshal(write, file);
        }catch (JAXBException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
                
        }
    }
}
