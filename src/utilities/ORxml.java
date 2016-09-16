package utilities;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class ORxml {
    public static void main(String arg[]) {
        try {
            File inputfile = new File("E:\\EclipseWorkspace\\projectDemo\\src\\utilities\\OR.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder docbuilder = dbFactory.newDocumentBuilder();
            Document doc = docbuilder.parse(inputfile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :"
                    + doc.getDocumentElement().getNodeName());
            NodeList nodelist = doc.getElementsByTagName("Object");
            System.out.println("##################################");
            for (int tmp = 0; tmp < nodelist.getLength(); tmp++) {
                Node nNode = nodelist.item(tmp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("object name : "
                            + eElement.getAttribute("name"));
                    System.out.println("propertytype : "
                            + eElement.getElementsByTagName("propertytype")
                            .item(0).getTextContent());
                    System.out.println("propertyvalue: "
                            + eElement.getElementsByTagName("propertyvalue")
                            .item(0).getTextContent());
                    System.out.println("--------------------------------------");
                }
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

}
