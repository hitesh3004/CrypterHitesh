import java.util.*;
public class StringCompression {
	
	public String getCharCount(String str){
		String s = "";
		ArrayList<Character> ch = new ArrayList<Character> ();
		ArrayList<Integer> count = new ArrayList<Integer>();
		for(int i = 0;i < str.length();i++){
			char c = str.charAt(i);
			if((ch.size() != 0) && (ch.get(ch.size()-1) == c)){
				int counter = count.get(ch.size()-1);
				counter++;
				count.set(ch.size()-1,counter);
			}
			else{
				ch.add(c);
				count.add(1);	
			}	
		}
		for(int i = 0;i < ch.size();i++){
			s = s + ch.get(i)+count.get(i);
		}
		return s;
	}	

	public static void main(String args[]){
		StringCompression count = new StringCompression();
		System.out.println(count.getCharCount("aabbbaaa"));
	}
}
