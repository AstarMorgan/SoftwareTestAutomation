//Author Name: Astar Morgan
//Date: 1/22/2022
//Course ID: CS230

package module3;

import java.util.concurrent.atomic.AtomicLong;

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String Number;
	private String Address;
	private static AtomicLong idGenerator = new AtomicLong();

	
	public Contact(String firstName, String lastName, String number, String address) {

		//FIRSTNAME
		if(firstName == null || firstName.isBlank()) {
		this.firstName = "NULL";
		//if the first name is longer than 10 characters, just grab the first 10 characters
		}
		else if(firstName.length()> 10) {
		this.firstName = firstName.substring(0,10);
		}
		else {
			this.firstName = firstName;
		}
		//LASTNAME
		if (lastName == null || lastName.isBlank()) {
		this.lastName = "NULL";
		}
		else if(lastName.length() > 10) {	
		this.lastName = lastName.substring(0,10);
		}else {
		this.lastName = lastName;
		}
		//NUMBER
		if(number == null || number.isBlank() || number.length() != 10) {
		this.Number = "5555555555";}
		else {this.Number = number;
		}
		//ADDRESS
		if(address == null || address.isBlank()) {
			this.Address = "NULL";
		}
		else if(address.length() > 30) {
			this.Address = address.substring(0,30);
			}
		else { this.Address = address;
		}
		}
		//GETTERS
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getNumber() {
		return Number;
	}
	public String getAddress() {
		return Address;
	}
	//SETTERS
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.isBlank()) {
			this.firstName = firstName;
	}
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.isBlank()) {
this.lastName = "NULL";	}
		else if(lastName.length() > 10) {
			this.lastName = lastName.substring(0,10);}
		else {
			this.lastName = lastName;
		}
}
public void setNumber(String number) {
	if(number == null|| number.isBlank() || number.length() != 10) {
this.Number = "5555555555";
}else {this.Number = number;
	}
}
public void setAdress(String address) {
	if(address == null || address.isBlank()) {
		this.Address = "NULL";
	}
	else if(address.length() > 30) {
		this.Address = address.substring(0,30);
	}else { this.Address = address;
}
}
}
