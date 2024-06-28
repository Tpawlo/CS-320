
package Tests;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Contact.contactService;



//This file contains tests for the contactService file

class contactServiceTest {
	
 
	contactService newContact = new contactService();
	//Test to make sure you can add a contact
	@Test
	void testAddContact() {
		newContact.addContact("12345", "Tabitha", "Pawlowski", "4845004000", "10 South Street");
		for (int i=0; i<newContact.contacts.size(); i++) {
			if(newContact.contacts.get(i).getId() == "12345") {
				assertTrue(newContact.contacts.get(i).getId().equals("12345"));
				assertTrue(newContact.contacts.get(i).getFirstName().equals("Tabitha"));
				assertTrue(newContact.contacts.get(i).getLastName().equals("Pawlowski"));
				assertTrue(newContact.contacts.get(i).getNumber().equals("4845004000"));
				assertTrue(newContact.contacts.get(i).getAddress().equals("10 South Street"));
				
			}
		}
		
	}
	

	
	
	//This throws an exception if someone tries to add a contact whose id is already in the list
		@Test
		void testAddExisitingContact() {
			newContact.addContact("12345", "Tabitha", "Pawlowski", "4845004000", "10 South Street");
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				newContact.addContact("12345", "Taylor", "Pawlowski", "484500500", "10 West Street");
			});
		}
		
	
	
	
	
	
	//Test to make sure you can delete a contact given the unique id
	@Test
	void testDeleteContact() {
		newContact.addContact("12345",  "Tabitha",  "Pawlowski", "4845004000", "10 South Street");
		newContact.deleteContact("12345");
		for (int i=0; i< newContact.contacts.size(); i++) {
			if(newContact.contacts.get(i).getId() == "12345" ) {
				fail("This contact has not been deleted");
			}
		}
	}
	
	
	//Test to make sure you can update a contact's first name given the id
	
	@Test
	void testUpdateByFirstName() {
		newContact.addContact("12345",  "Tabitha",  "Pawlowski", "4845004000", "10 South Street");
		newContact.updateFirstName("12345", "Taylor");
		for (int i=0; i < newContact.contacts.size(); i++) {
			if(newContact.contacts.get(i).getId() == "12345") {
				assertTrue(newContact.contacts.get(i).getFirstName().equals("Taylor"));
			}
			
		}	
		
	}
	
	
	//Test to make sure you can update last name given the id
	@Test
	void testUpdateByLastName() {
		newContact.addContact("12345",  "Tabitha",  "Pawlowski", "4845004000", "10 South Street");
		newContact.updateLastName("12345", "Peters");
		for (int i=0; i < newContact.contacts.size(); i++) {
			if(newContact.contacts.get(i).getId() == "12345") {
				assertTrue(newContact.contacts.get(i).getLastName().equals("Peters"));
			}
			
		}	
		
	}
	
	
	
	//Test to make sure you can update the phone number of the contact given the id
	@Test
	void testUpdateByNumber() {
		newContact.addContact("12345",  "Tabitha",  "Pawlowski", "4845004000", "10 South Street");
		newContact.updateNumber("12345", "4841002345");
		for (int i=0; i < newContact.contacts.size(); i++) {
			if(newContact.contacts.get(i).getId() == "12345") {
				assertTrue(newContact.contacts.get(i).getNumber().equals("4841002345"));
			}
			
		}	
		
	}
	
	
	
	//Test to make sure you can update the address given the id
	@Test
	void testUpdateByAddress() {
		newContact.addContact("12345",  "Tabitha",  "Pawlowski", "4845004000", "10 South Street");
		newContact.updateAddress("12345", "5 West Road");
		for (int i=0; i < newContact.contacts.size(); i++) {
			if(newContact.contacts.get(i).getId() == "12345") {
				assertTrue(newContact.contacts.get(i).getAddress().equals("5 West Road"));
			}
			
		}	
		
	}
	
	
	
}


