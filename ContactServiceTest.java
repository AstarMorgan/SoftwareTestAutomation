//Author: Astar Morgan
//Date: 1/25/2022
//Course ID: CS 230
//UNIT TESTS FOR THE CONTACTSERVICETEST

package module3;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {
	@Test
	@DisplayName("Test to Update First Name.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Picker", "5555551111", "321 Shelby Ln");
		service.updateFirstName("Carlos","0");
		assertEquals("Carlos",service.getContact("0").getFirstName(),"First name was not updated.");
		
	
	}

	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Dr.","Picker","5555551111","321 Shelby Ln");
		service.updateLastName(Ca)
	}

}
