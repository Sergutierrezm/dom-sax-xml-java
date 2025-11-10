package nf3.accesodatos.dom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;

public class NF3AccesoDatosDOM {

    public static void main(String[] args) {

        try {

            //Creamos el generador de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();

            //Creamos el documento XML con elemento raiz "personas"
            Document documento = implementation.createDocument(null, "personas", null);
            documento.setXmlVersion("1.0");

            //persona 1
            Element persona1 = documento.createElement("persona");

            Element nombre1 = documento.createElement("nombre");
            nombre1.setTextContent("Sergio");
            persona1.appendChild(nombre1);

            Element edad1 = documento.createElement("edad");
            edad1.setTextContent("28");
            persona1.appendChild(edad1);

            Element nacionalidad1 = documento.createElement("nacionalidad");
            nacionalidad1.setTextContent("España");
            persona1.appendChild(nacionalidad1);

            documento.getDocumentElement().appendChild(persona1);

            //persona 2
            Element persona2 = documento.createElement("persona");

            Element nombre2 = documento.createElement("nombre");
            nombre2.setTextContent("Alba");
            persona2.appendChild(nombre2);

            Element edad2 = documento.createElement("edad");
            edad2.setTextContent("24");
            persona2.appendChild(edad2);

            Element nacionalidad2 = documento.createElement("nacionalidad");
            nacionalidad2.setTextContent("España");
            persona2.appendChild(nacionalidad2);

            documento.getDocumentElement().appendChild(persona2);

            //persona 3
            Element persona3 = documento.createElement("persona");

            Element nombre3 = documento.createElement("nombre");
            nombre3.setTextContent("Jose");
            persona3.appendChild(nombre3);

            Element edad3 = documento.createElement("edad");
            edad3.setTextContent("26");
            persona3.appendChild(edad3);

            Element nacionalidad3 = documento.createElement("nacionalidad");
            nacionalidad3.setTextContent("España");
            persona3.appendChild(nacionalidad3);

            documento.getDocumentElement().appendChild(persona3);

            //Guardar el archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(documento);
            StreamResult result = new StreamResult(new File("personas.xml"));

            transformer.transform(source, result);

            System.out.println("Archivo persona.xml creado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
