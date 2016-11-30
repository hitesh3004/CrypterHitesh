import java.io.*;
public class DecimalToBinary {
	public static void main(String args[])throws IOException{
				
		DecimalToBinary dectobin = new DecimalToBinary();
		System.out.println(dectobin.toDecimal(100));
	}
	public String toBinary(int num){
		String binary = "";
		while(num != 0){
			int d = num%2;
			num /=2;
			binary = Integer.toString(d) + binary;
		}
		
		return binary;
	}
	
	public int toDecimal(int num){
		
		String number = Integer.toString(num);
		int len = number.length();
		int[] digits = new int[len];
		int i =0;
		
		while(num!=0 && i<len){
			int d = num%10;
			num /=10;
			digits[i] = d;
			i++;
		}
		int dec = 0;
		for(int j=0;j<len;j++){
			int d = digits[j];
			if(d == 1){
				int pow = (int)Math.pow(2, j);
				dec = dec + pow;
			}
		}
		return dec;
	}

}
