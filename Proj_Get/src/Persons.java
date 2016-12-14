import java.util.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
public class Persons {
	
	static ArrayList<Person> persons = new ArrayList<Person>();
	
	public static void main(String args[]){
		
		 try {
				File fXmlFile = new File("C:/Users/HL/Downloads/Persons.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
				
				doc.getDocumentElement().normalize();

				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

				NodeList nList = doc.getElementsByTagName("Person");

				System.out.println("----------------------------");

				for (int temp = 0; temp < nList.getLength(); temp++) {

					Node nNode = nList.item(temp);

					System.out.println("\nCurrent Element :" + nNode.getNodeName());

					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;
						
						Person temp_person = new Person(eElement.getElementsByTagName("FirstName").item(0).getTextContent(),
								eElement.getElementsByTagName("LastName").item(0).getTextContent(),eElement.getElementsByTagName("Apartment").item(0).getTextContent(),
								eElement.getElementsByTagName("Street").item(0).getTextContent(),eElement.getElementsByTagName("City").item(0).getTextContent(),
								eElement.getElementsByTagName("Country").item(0).getTextContent(),eElement.getElementsByTagName("Pincode").item(0).getTextContent(),
								eElement.getElementsByTagName("Mobile").item(0).getTextContent(),eElement.getElementsByTagName("Home").item(0).getTextContent());
						persons.add(temp_person);
					}
				}
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 System.out.println("**********");
		 System.out.println(persons.get(0).get_Name().get_first_name());
	}
}
