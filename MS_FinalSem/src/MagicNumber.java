
public class MagicNumber {
	
	public int numSum(int number){
		int sum_digit = 0;
		while(number != 0){
			int digit = number % 10;
			number = number / 10;
			sum_digit = sum_digit + digit;
		}
		return sum_digit;
	}
	
	public boolean isMagicNumber(int number){
		int isMagic = 10;
		while(isMagic > 9){
			isMagic = numSum(number);
		}
		if(isMagic == 1)
			return true;
		return false;
	}
	
	public static void main(String args[]){
		MagicNumber magic = new MagicNumber();
		System.out.println(magic.isMagicNumber(-110000001));
	}
}
