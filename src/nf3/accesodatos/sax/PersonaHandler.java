
package nf3.accesodatos.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 *
 * @author sergiogutierrez
 */
public class PersonaHandler extends DefaultHandler {
    //Variable para guardar temporalmente el texto entre etiquetas
    private String contenidoActual = "";
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        //Metodo que se ejecuta cuando SAX encuentra una etiqueta de apertura
        System.out.println("Comienza la etiqueta" + "  "+ qName);
        
    }
    
    @Override
    
    public void characters (char[] ch, int start, int length){
        //guarda el texto que hay entre etiquetas
        contenidoActual = new String(ch, start, length).trim();
    }
    
    @Override
    
   public void endElement(String uri, String localName, String qName){
       //Se ejecuta cuando se cierra una etiqueta
       if(!contenidoActual.isEmpty()){
           System.out.println("     " + qName + ": " + contenidoActual);
       }
       contenidoActual = ""; //limpio para la proxima etiqueta
   }
    
}
