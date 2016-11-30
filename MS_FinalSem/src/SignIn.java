import java.util.*;
import java.io.*;
public class SignIn {
	
	public HashMap<String,String> ReadCsv(String csvFile){

		BufferedReader br = null;
		String line = "";
		String split = ",";
		HashMap<String,String> hash = new HashMap<String,String>();
		
		try{
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] users = line.split(split);
				hash.put(users[3], users[5]);
				}
		}
		
        catch (FileNotFoundException e) {
        	e.printStackTrace();
        } 
		catch (IOException e) {
			e.printStackTrace();
        } 
		return hash;
	}
	
	public static void main(String args[])throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		SignIn sign = new SignIn();
		HashMap<String,String> signHash = new HashMap<String,String>();
		signHash = sign.ReadCsv("C:/Users/HL/Downloads/MOCK_DATA.csv");

		System.out.println("Enter username : ");
		String username = br.readLine();
		String password = signHash.get(username);
		System.out.println("Password is : " + password);
	}
}
