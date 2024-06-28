package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Contact.Contact;



class contactTests {

	//Test to make sure you can assign data to each of the contact's values
	@Test
	void testContactClass() {
		Contact newContact = new Contact("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
		assertTrue(newContact.getId().equals("12345"));
		assertTrue(newContact.getFirstName().equals("Tabitha"));
		assertTrue(newContact.getLastName().equals("Pawlowski"));
		assertTrue(newContact.getNumber().equals("4844005000"));
		assertTrue(newContact.getAddress().equals("10 South Street"));
	}

	//Test to make sure that an id cannot be too long
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567891011", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
		});
	}

 //Test to make sure the id cannot be null
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Tabitha", "Pawlowski", "4844005000", "10 South Street");
		});
	}

	

	
	//Makes sure that the code allows an ID to be exactly 10 digits long
	@Test
	void testGetIdTenDigits() {
		Contact contact = new Contact  ("1234567890", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
		assertTrue(contact.getId().equals("1234567890"));
	}

	
	//Makes sure that the code allows an ID to be less than 10 digits
		@Test
		void testGetIdLessThan10() {
			Contact contact = new Contact  ("123456", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
			assertTrue(contact.getId().equals("123456"));
		}
	
	
	//Test to make sure the first name cannot be too long
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "TestTabitha", "Pawlowski", "4844005000", "10 South Street");
		});
	}
	
	
	//Test to make sure the first name cannot be null
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Pawlowski", "4844005000", "10 South Street");
		});
	}
	

	//Makes sure that the code allows a name to be exactly 10 digits long
	@Test
	void testFirstName10Digits() {
		Contact contact = new Contact  ("12345", "TestNameee", "Pawlowski", "4844005000", "10 South Street");
		assertTrue(contact.getFirstName().equals("TestNameee"));
	}
	
	
	//Makes sure that the code allows a name to be less than 10 digits
		@Test
		void testFirstNameLessThan10Digits() {
			Contact contact = new Contact  ("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
			assertTrue(contact.getFirstName().equals("Tabitha"));
		}
	
	
	//Test to make sure last name cannot be too long
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Tabitha", "TestPawlowski", "484400500000", "10 South Street");
		});
	}
	
	
	

	//Test to make sure last name cannot be null
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Tabitha", null, "4844005000", "10 South Street");
		});
	}
	
	
	//Makes sure that the code allows a last name to be exactly 10 digits long
		@Test
		void testLastName10Digits() {
			Contact contact = new Contact  ("12345", "Tabitha", "Pawlowskii", "4844005000", "10 South Street");
			assertTrue(contact.getLastName().equals("Pawlowskii"));
		}
		
		
	
		//Makes sure that the code allows a last name to be less than 10 digits
		@Test
		void testLastNameLessThan10Digits() {
			Contact contact = new Contact  ("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
			assertTrue(contact.getLastName().equals("Pawlowski"));
		}
			
		
		
	//Test to make sure number is not too short(must be exactly 10 digits)
	@Test
	void testNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Tabitha", "Pawlowski", "48440050", "10 South Street");
		});
	}
	
	
	//Test to make sure number is not too long (must be exactly 10 digits)
	@Test
	void testNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Tabitha", "Pawlowski", "4844005000000", "10 South Street");
		});
	}
	
	
	//Test to make sure number is not null
	@Test
	void testNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Tabitha", "Pawlowski", null, "10 South Street");
		});
	}
	
	
	//Makes sure that the code allows a number to be exactly 10 digits long
	@Test
	void testNumberMustBe10Digits() {
		Contact contact = new Contact  ("12345678", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
		assertTrue(contact.getNumber().equals("4844005000"));
	}
	
	
	//Test to make sure address cannot be too long
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Tabitha", "Pawlowski", "4844005000", "Test 10507 SouthEast Street Apartment 10B");
		});
	}

	
	//Test to make sure address is not null
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Tabitha", "Pawlowski", "4844005000", null);
		});
	}
	
	//Makes sure that the code allows an address to be exactly 30 digits long
		@Test
		void testAddress30Digits() {
			Contact contact = new Contact  ("12345", "Tabitha", "Pawlowski", "4844005000", "107 South Street New York City");
			assertTrue(contact.getAddress().equals("107 South Street New York City"));
		}


	//Makes sure that the code allows an address to be less than 30 digits
	@Test
	void testAddressLessThan30Digits() {
		Contact contact = new Contact  ("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
		assertTrue(contact.getAddress().equals("10 South Street"));
	}

	//This makes sure you can retrieve the id of a contact
	@Test
	void testGetContactId() {
		Contact newContact = new Contact ("12345", "Tabitha", "Pawlowski", "4845004000", "10 South Street");
		assertTrue(newContact.getId().equals("12345"));
	}
	
	
	//This makes sure you can retrieve the first name of a contact
		@Test
		void testGetContactFirstName() {
			Contact newContact = new Contact ("12345", "Tabitha", "Pawlowski", "4845004000", "10 South Street");
			assertTrue(newContact.getFirstName().equals("Tabitha"));
		}
		
		
		
		//This makes sure you can retrieve the last name of a contact
				@Test
				void testGetContactLastName() {
					Contact newContact = new Contact ("12345", "Tabitha", "Pawlowski", "4845004000", "10 South Street");
					assertTrue(newContact.getLastName().equals("Pawlowski"));
				}
				
				
				
	//This makes sure you can retrieve the number of a contact
	@Test
	void testGetContactNumber() {
		Contact newContact = new Contact ("12345", "Tabitha", "Pawlowski", "4845004000", "10 South Street");
		assertTrue(newContact.getNumber().equals("4845004000"));
	}
	
	
	//This makes sure you can retrieve the address of a contact
	@Test
	void testGetAddress() {
		Contact newContact = new Contact ("12345", "Tabitha", "Pawlowski", "4845004000", "10 South Street");
		assertTrue(newContact.getAddress().equals("10 South Street"));
	}
				
				
		
		
		
	
	//Makes sure you can set a value for the first name
		@Test
		void testSetFirstName() {
			Contact contact = new Contact ("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
			contact.setFirstName("Taylor");
			assertTrue(contact.getFirstName().equals("Taylor"));
		}
	
		
		
//Makes sure you can set a value for the last name
		@Test
		void testSetLastName() {
			Contact contact = new Contact ("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
			contact.setLastName("Smith");
			assertTrue(contact.getLastName().equals("Smith"));
		}
	
		
		//Makes sure you can set a value for the number
		@Test
		void testSetNumber() {
			Contact contact = new Contact ("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
			contact.setNumber("6101231234");
			assertTrue(contact.getNumber().equals("6101231234"));
		}

	



//Makes sure that you can set a value for the address

	@Test
	void testSetAddress() {
		Contact contact = new Contact ("12345", "Tabitha", "Pawlowski", "4844005000", "10 South Street");
		contact.setAddress("5 East Avenue");
		assertTrue(contact.getAddress().equals("5 East Avenue"));
	}
	
}


