
import java.util.*;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class merge {

    public static void main(String[] args) {
        try {
        	int i=0;
        	int j=0;
        	
            Map<String,Element> store = new LinkedHashMap<String,Element>();

            File document1 = new File("license1.xml");
            File document2 = new File("license2.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc1 = db.parse(document1);
            Document doc2 = db.parse(document2);

            Document merged_document = db.newDocument();

            doc1.getDocumentElement().normalize();
            doc2.getDocumentElement().normalize();
            
            NodeList list1 = doc1.getElementsByTagName("CSR_Producer");
    		NodeList list2 = doc2.getElementsByTagName("CSR_Producer");
    		
    		Element root = merged_document.createElement("CSR_Producer");
    		merged_document.appendChild(root);
    		
    		while(i < list2.getLength()) {
                Node node2 = list2.item(i);
                Element ele2 = (Element) node2;
                StringBuffer sb = new StringBuffer(ele2.getAttribute("NIPR_Number"));
                NodeList listoflicenses2 = ele2.getElementsByTagName("License");
                
                while(j < listoflicenses2.getLength()){
                    Element license2 = (Element) listoflicenses2.item(j);
                    sb.append(license2.getAttribute("License_Number"+ "-"));
                    sb.append(license2.getAttribute("Date_Status_Effective"+ "-"));
                    sb.append(license2.getAttribute("State_Code"+ "-")); 
                    store.put(sb.toString(), license2);
                    ++j;
                }
                ++i;
            }
    		
    		while(i < list1.getLength()) {
                Node node1 = list1.item(i);
                Element ele1 = (Element) node1;
                StringBuffer sb = new StringBuffer(ele1.getAttribute("NIPR_Number"));
                NodeList listoflicenses1 = ele1.getElementsByTagName("License");
                
                while(j < listoflicenses1.getLength()){
                    Element license1 = (Element) listoflicenses1.item(j);
                    sb.append(license1.getAttribute("License_Number" + "-"));
                    sb.append(license1.getAttribute("Date_Status_Effective" + "-"));
                    sb.append(license1.getAttribute("State_Code" + "-"));                  
                    if(store.containsKey(sb.toString())){
                        Node license = merged_document.importNode(license1, true);
                        root.appendChild(license);
                    }
                    
                    ++j;
                }
                ++i;
            }

    		Transformer tf = TransformerFactory.newInstance().newTransformer();
            tf.transform(new DOMSource(merged_document), new StreamResult(new File("merged.xml")));
            System.out.print("Merged");
            
            }

        catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }
    }

}