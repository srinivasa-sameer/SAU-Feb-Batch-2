import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Deserializefromxml {

	public static void main(String[] args) throws IOException {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		String path = "C:\\Users\\LENOVO\\OneDrive\\Desktop\\workspace\\Java-Morning Assignement\\studentdata.xml";
		
		File xmlFile = new File(path);
		DocumentBuilder db;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();   
		try {
	        
			db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc = db.parse(xmlFile); 
            ((org.w3c.dom.Document) doc).getDocumentElement().normalize();
	   
            
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());  

            NodeList nl = doc.getElementsByTagName("student");  

            for (int itr = 0; itr < nl.getLength(); itr++)   
            {  
            Node node = nl.item(itr);  
            if (node.getNodeType() == Node.ELEMENT_NODE)   
            {  
            Element eElement = (Element) node;  
            
            int roll = Integer.parseInt(eElement.getElementsByTagName("roll").item(0).getTextContent());
            int marks = Integer.parseInt(eElement.getElementsByTagName("marks").item(0).getTextContent());
            
            if(map.containsKey(roll)) {
            	int prev = map.get(roll);
            	map.put(roll ,prev + marks );
            }
            else {
            	map.put(roll,marks);
            }
            
            }  
            }  
            
	       System.out.println(map);
	    }
		
		//Exception Handling
		catch (IOException e) {
	    	System.out.println("IO Exception");
	    } catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}
		
		System.out.println("Serializing Data into student.txt");
		try {
            FileWriter w = new FileWriter("./students.txt", true);
            for(int roll:map.keySet()) {
            	w.write(roll +","+map.get(roll));
            	 w.write("\r\n"); 
            } 
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}