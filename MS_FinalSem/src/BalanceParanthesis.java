import My_Implementations.myStack;

public class BalanceParanthesis {
	
	public boolean isBalance(String expression){
		
		myStack stack = new myStack();
		
		char c = ' ';
		for(int i = 0;i < expression.length(); i++){
			c = expression.charAt(i);
			if(c == '(' || c == '{' || c == '[')
				stack.Push(c);
			else if((c == ')' && stack.getHeadData() == '(') 
					|| (c == '}' && stack.getHeadData() == '{') 
					|| (c == ']' && stack.getHeadData() == '['))
				stack.Pop();
		}
		if(stack.isEmpty() == true)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]){
		BalanceParanthesis balance = new BalanceParanthesis();
		System.out.println(balance.isBalance("{[((){}[])]"));
	}

}
