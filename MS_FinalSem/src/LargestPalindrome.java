import java.util.*;
public class LargestPalindrome {
	public String getLongest(String str){
		ArrayList<String> palindrome = new ArrayList<String>();
		for(int i = 0;i < str.length()-1;i++){
			for(int j = str.length()-1;j > i;j--){
				String substr = str.substring(i,j+1);
				if(substr.length()>1)
					if(isPalindrome(substr))
						palindrome.add(substr);
			}
		}
		return longestFromList(palindrome);
	}
	
	public String longestFromList(ArrayList<String> list){
		
		if(list.isEmpty())
			return "";
		String longest = "";
		for(int i = 0;i < list.size();i++){
			if(list.get(i).length() > longest.length())
				longest = list.get(i);
		}
		return longest;
	}
	
	
	public boolean isPalindrome(String str){
		
		String reverse = "";
		
		for(int i = str.length()-1;i >= 0;i--){
			reverse = reverse + str.charAt(i);
		}
		return reverse.equals(str);
	}
	
	public static void main(String args[]){
		LargestPalindrome palin = new LargestPalindrome();
		System.out.println(palin.getLongest("ifiknowwhatyoumeanhereamanaplanacanalpanamayouwouldbedead"));
	}
	
}
