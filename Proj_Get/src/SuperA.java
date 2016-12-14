
public abstract class SuperA {
	
	public abstract int abc();
	
	int i;
	public void getName(){
		System.out.println("super");
		
	}
	public SuperA(String a){
		System.out.println(a);
	}
	public SuperA(int a){
		i = a;
		System.out.println(a);
	}
}
