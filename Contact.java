// Tabitha Pawlowski
// CS-320 Software test, Automation, QA
// 5/23/2024
package Contact;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String number;
	private String address;

	// This file contains the Contact information. It includes the limitations each parameter has, such as what
	//it can't be longer than,and if it can't be null. Also, this file contains the getter and setter methods
	
	public Contact(String id, String firstName, String lastName, String number, String address) {
		
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid customer ID");	
		}	
		
		
		if (firstName == null ||firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		
		if (number == null || number.length() > 10 || number.length() < 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
		
	}
	
	
	public String getId() {
		return id;
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
	
	
	
	
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
};