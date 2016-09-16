package utilities;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class ReadXmlFile {
	public static void main(String arg[]){
	    try{
		File inputfile= new File("E:\\EclipseWorkspace\\projectDemo\\src\\utilities\\Sears.xml");
		DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder docbuilder=dbFactory.newDocumentBuilder();
		Document doc=docbuilder.parse(inputfile);
		
		 
		 
		NodeList listSears=doc.getDocumentElement().getChildNodes();
		  outer:
		  for(int i=0;i<listSears.getLength();i++){
		      Node nNode=listSears.item(i);
			  if(nNode.getNodeName()!="Sears"){
			     System.out.println(i+".: "+nNode.getNodeName());
				 continue outer;
				 }
			  NodeList listChildNode=nNode.getChildNodes();
		      for(int j=0;j<listChildNode.getLength();j++){
			    Node lNode=listChildNode.item(j);
			    if(lNode.getNodeName()!="Sears"){
			     System.out.println(i+"."+j+": "+lNode.getNodeName());
			  }	
		  }
		}
	   }catch(Exception e){
	    e.getMessage();
		e.printStackTrace();
	   }
	  }

}
