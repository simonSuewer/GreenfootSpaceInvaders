import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import javax.xml.bind.*;

public class XML  
{
    
    
    public static final String path = "save.xml";
    private DocumentBuilderFactory factory;
    private DocumentBuilder builder;
    private Document document;
    
    public static void main(String[] args) {
        XML test = new XML();
        System.out.println( test.document.getFirstChild().getTextContent() );
	}
	
    

    public XML()
    {
    	/*factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse( new File(path) ); */
        
    }

    public void init() throws JAXBException
    {
        Safegame write = new Safegame();
        
        write.setLvl(1);
        write.setCredits(2);
        write.setScore(3);
        
        JAXBContext jaxbContext = JAXBContext.newInstance(Safegame.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(write, System.out);
    }
}
