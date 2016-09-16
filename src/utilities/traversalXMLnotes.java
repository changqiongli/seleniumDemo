package utilities;

import java.io.File;  
import java.util.List;  
  
import org.dom4j.Attribute;  
import org.dom4j.Document;  
import org.dom4j.Element;  
import org.dom4j.io.SAXReader;  
  
 
public class traversalXMLnotes {  
  
    public static void main(final String[] args) {  
        final traversalXMLnotes test = new traversalXMLnotes();  
        try {  
            test.testGetRoot();  
        } catch (final Exception e) {  
             e.printStackTrace();  
        }  
    }  
      /** 
     *  get root note
     */  
    public void testGetRoot() throws Exception {  
        final SAXReader sax = new SAXReader(); 
        final File xmlFile = new File("E:\\EclipseWorkspace\\projectDemo\\src\\utilities\\Sears.xml"); 
        final Document document = sax.read(xmlFile);   
        final Element root = document.getRootElement(); 
        getNodes(root);// traversal all notes  
      }  
  
    /** 
     * from Element node, recursive
     */  
    public void getNodes(final Element node) {  
        System.out.println("-------begin new notes-------------");  
           
        System.out.println("current name：" + node.getName()); 
        System.out.println("current content：" + node.getTextTrim()); 
        final List<Attribute> listAttr = node.attributes(); 
        for (final Attribute attr : listAttr) { 
            final String name = attr.getName(); 
            final String value = attr.getValue(); 
            System.out.println("Attribute name：" + name + "Attribute value：" + value);  
        }  
  
        //recursive 
        final List<Element> listElement = node.elements();// traversal the first level childnotes list  
        for (final Element e : listElement) {// traversal the first level childnotes 
            getNodes(e);   
        }  
    }

}  
