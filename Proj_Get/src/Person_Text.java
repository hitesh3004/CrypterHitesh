
public class Person_Text {
	
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	
	public Person_Text(int id,String firstName,String lastName,String phone){
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
