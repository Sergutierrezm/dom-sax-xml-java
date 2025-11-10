package nf3.accesodatos.dom.lectura;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class mainLecturaDOM {


    public static void main(String[] args) {

        try {
            
            //Creamos el generador de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            //Cargamos el documento XMl desde el fichero
            
            Document doc = builder.parse(new File("personas.xml"));
            doc.getDocumentElement().normalize();
            
            //obtener la lista de elementos <persona>
            
            NodeList listaPersonas = doc.getElementsByTagName("persona");
            
            //bucle for para recorrer cada persona y mostrar sus datos
            
            for (int i = 0; i < listaPersonas.getLength(); i++){
                Node nodoPersona = listaPersonas.item(i); // obtener el nodo en la posicion i
            
                //comprobar que el nodo sea un elemento
                if (nodoPersona.getNodeType() == Node.ELEMENT_NODE){
               
                //convertir el nodo generico en element para acceder a sus hijos    
                Element persona = (Element) nodoPersona;
                
                String nombre = persona.getElementsByTagName("nombre").item(0).getTextContent();
                String edad = persona.getElementsByTagName("edad").item(0).getTextContent();
                String nacionalidad = persona.getElementsByTagName("nacionalidad").item(0).getTextContent();
                
                System.out.println("Persona " + (i+1) + ":");
                System.out.println(" Nombre: " + nombre);
                System.out.println("Edad: " +  edad);
                System.out.println("Nacionalidad: " + nacionalidad);
                System.out.println("----------------------");
                
                
            }
        }
            
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
}
