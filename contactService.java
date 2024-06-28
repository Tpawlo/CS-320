package Contact;

import java.util.ArrayList;





//This file contains the contact service information for the program. It includes an array to hold all of the
// contacts in one places, as well as a method to add or delete contacts. There are also functions to update the
//contact's first or last name, phone number, and address

public class contactService { 
	
	public ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	

	
	
	public void addContact(String newId, String newFirstName, String newLastName, String newNumber, String newAddress) {
		Contact newContact = new Contact(newId, newFirstName, newLastName, newNumber, newAddress);
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId() == newId){
				throw new IllegalArgumentException("This unique contact ID is already in use");
			}
		}
		contacts.add(newContact);
	}
	
	
	
	
	public void deleteContact(String oldContact) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getId() == oldContact) {
				contacts.remove(i);
			}
		}
	}
	
	

	
	public void updateFirstName(String id, String updatedFirstName) {
		for (int i=0; i < contacts.size(); i++) {
			if(contacts.get(i).getId() == id) {
				contacts.get(i).setFirstName(updatedFirstName);
			}
		}
	}
	
	
	
	public void updateLastName(String id, String updatedLastName) {
		for (int i=0; i < contacts.size(); i++) {
			if(contacts.get(i).getId() == id) {
				contacts.get(i).setLastName(updatedLastName);
			}
		}
	}
	
	
	
	public void updateNumber(String id, String updatedNumber) {
		for (int i=0; i < contacts.size(); i++) {
			if(contacts.get(i).getId() == id) {
				contacts.get(i).setNumber(updatedNumber);
			}
		}
	}
	
	
	
	
	public void updateAddress(String id, String updatedAddress) {
		for (int i=0; i < contacts.size(); i++) {
			if(contacts.get(i).getId() == id) {
				contacts.get(i).setAddress(updatedAddress);
			}
		}
	}
	
	
	

	
	
}
