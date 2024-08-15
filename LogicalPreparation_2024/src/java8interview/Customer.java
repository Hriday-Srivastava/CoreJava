package java8interview;

import java.util.List;

public class Customer {


	
	 int id;
	 String name ;
	 String email;
	 List<String> phoneNumbers;
	 
	 
	 
	 
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param phoneNumbers
	 */
	public Customer(int id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	 
	 
	


}
