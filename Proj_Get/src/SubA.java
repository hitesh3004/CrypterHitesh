
public class SubA extends SuperA {
	
	
	public int abc(){
		System.out.println("hey");
		return 0;
	}
	
	public void getName(){
		System.out.println("sub");
	}
	
	public void only_sub(){
		System.out.println("only sub");
	}
	
	public SubA(){
		super(1);
	}
	
	public static void main(String args[]){
		SuperA obj = new SubA();
		obj.getName();
		((SubA)obj).getName();
		((SubA)obj).only_sub();
		
	}
}
