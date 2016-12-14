import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Read_JsonFile {
	
	public void read_jsonFile(String fileName){
		 JSONParser parser = new JSONParser();
		 
	        try {
	 
	            Object obj = parser.parse(new FileReader(fileName));
	 
	            JSONObject jsonObject = (JSONObject) obj;
	 
	            String id = (String) jsonObject.get("Id");
	            
	            String author = (String) jsonObject.get("Author");
	            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
	 
	            System.out.println("Name: " + id);
	            System.out.println("Author: " + author);
	            System.out.println("\nCompany List:");
	            Iterator<String> iterator = companyList.iterator();
	            while (iterator.hasNext()) {
	                System.out.println(iterator.next());
	            }
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	            }
	        }
	
	public static void main(String args[]){
		String fileName = "C:/Users/HL/Downloads/Hitesh_JsonReader.json";
		Read_JsonFile reader = new Read_JsonFile();
		reader.read_jsonFile(fileName);
	}
}
