//Author: Astar morgan
//Date: 01/23/2022
//CourseID: CS230


package module3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class ContactTest {
	
	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new
		Contact("FirstName","LastName","PhoneNumber","Address");
		if(contact.getContactID().length() >10) {
			fail("Contact ID has more than 10 characters.");
			
		}
	}
	
@Test
@DisplayName("Contact First Name cannot have more than 10 characters")
void testContactFirstNameWithMoreThanTenCharacters() {
	Contact contact = new
	Contact("Jerry","LastName","PhoneNumber","Address");
	if(contact.getFirstName().length() > 10) {
		fail("First Name has more thqan 10 characters.");
	}
}
@Test
@DisplayName("Contact cannot have more than 10 characters")
void testContactLastNameWithMoreThanTenCharacters() {
	Contact contact = new
	Contact("FirstName","Jerry","PhoneNumber","Address");
	if(contact.getLastName().length() > 10) {
		fail("Last Name has more than 10 characters.");
	}
}
@Test
@DisplayName("Contact phone number is exactly 10 characters")
void testContactNumberWithMoreThanTenCharacters() {
	Contact contact = new Contact("FirstName","LastName","5555555555","Address");
	if(contact.getNumber().length()!= 10) {
		fail("Phone number length does not equal 10.");
	}
}
@Test
@DisplayName("Contact address cannot have more than 30 characters")
void test ContactAddressWithMoreThanThirtyCharacters() {
	Contact contact = new
	Contact("FirstName","LastName","PhoneNumber","123456789 is nine characters long");
	if(contact.getAddress().length() > 30) {
		fail("Address has more than 30 characters");
	}
}
@Test
@DisplayName("Contact First Name shall not be null")
void testContactFirstNameNotNull() {
	Contact contact = new Contact(null,"LastName","PhoneNumber","Address");
	assertNotNull(contact.getLastName(),"Last name was null.");
}
@Test
@DisplayName("Contact Phone Number shall not be null")
void testContactPhoneNotNull() {
	Contact contact = Contact("FirstName","LastName",null,"Address");
	assertNotNull(contact.getNumber(),"Phone number was null.");
}
@Test
@DisplayName("Contact Address shall not be null")
void testContactAddressNotNull() {
	Contact contact = new Contact ("FirstName","LastName","PhoneNumber"null);
	assertNotNull(contact.getAddress(),"Address was null.");
}
}
