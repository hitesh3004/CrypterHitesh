
public class Address {
	
	private String apartment;
	private String street;
	private String city;
	private String country;
	private String pincode;
	
	public Address(String apartment,String street,String city,String country,String pincode){
		this.apartment = apartment;
		this.street = street;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	
	public String get_apartment(){
		return apartment;
	}
	
	public String get_street(){
		return street;
	}
	
	public String get_city(){
		return city;
	}
	
	public String get_country(){
		return country;
	}
	
	public String get_pincode(){
		return pincode;
	}
}
