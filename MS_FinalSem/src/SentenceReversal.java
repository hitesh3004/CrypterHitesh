public class SentenceReversal {
	private char sentence[];
	
	public void switchChar(int i,int j){
		char t = sentence[i];
		sentence[i] = sentence[j];
		sentence[j] = t;
	}
	
	public void reverseString(int startIndex,int endIndex){
		for(int i=0;i<(endIndex-startIndex)/2;i++){
			switchChar(startIndex+i,endIndex-i-1);
		}
	}
	
	public void reverseSentence(){
		int len = sentence.length;
		int prevSpace = 0;
		reverseString(prevSpace,len);
		for(int i=0;i<len;i++){
			if(sentence[i] == ' '){
				reverseString(prevSpace, i);
				prevSpace = i+1;
			}
		}
		reverseString(prevSpace, len);
	}
	
	public void populateArray(String str){
		sentence =  new char[str.length()];
		for(int i=0;i<str.length();i++){
			sentence[i] = str.charAt(i);
		}
	}
	
	public void printArray(){
		for(char c:sentence){
			System.out.print(c);
		}
	}
	
	public static void main(String args[]){
		SentenceReversal reverse = new SentenceReversal();
		String sen = "Hi my name is Hitesh Laware";
		
		reverse.populateArray(sen);
		reverse.reverseSentence();
		reverse.printArray();
	}
}
