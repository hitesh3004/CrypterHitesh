import java.io.*;
import java.util.*;
public class ReadTextFile {
	
	private ArrayList<Person_Text> person_text;
	
	public ReadTextFile(){
		person_text = new ArrayList<Person_Text>();
	}
	
	public void readTextFile(String fileName){
		
		String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
            	String person[] = line.split(",");
            	Person_Text temp_person = new Person_Text(Integer.parseInt(person[0]), person[1], person[2], person[3]); 
                person_text.add(temp_person);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}
	
	public static void main(String args[]){
		ReadTextFile reader = new ReadTextFile();
		String filename = "C:/Users/HL/Downloads/MOCK_DATA_TEXT.txt" ;
		reader.readTextFile(filename);
		System.out.println(reader.person_text.get(0).getId());
		
	}
	
}
