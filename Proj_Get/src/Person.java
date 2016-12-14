
public class Person {

	private Name person;
	private Address person_add;
	private Phone person_phone;
	
	public Person(String f,String l,String a,String s,String c,String c1,String p,String m,String h){
		person = new Name(f,l);
		person_add = new Address(a,s,c,c1,p);
		person_phone = new Phone(m,h);
	}
	
	public Name get_Name(){
		return person;
	}
	
	public Address get_Address(){
		return person_add;
	}
	
	public Phone get_Phone(){
		return person_phone;
	}
}
