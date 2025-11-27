package nf3.accesodatos.sax;
import java.io.*;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;




public class main {


    public static void main(String[] args) {
        
        try{
            //Creamos el parser SAX
            
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            
            //Procesamos el archivo XMl con nuestro manejador
            
            parser.parse("personas.xml", new PersonaHandler());
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
