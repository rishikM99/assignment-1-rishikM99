package person;
import java.util.*;
public class Person implements Comparable<Person> {
	
	private String firstName;
	private String lastName;
	private ArrayList<String> contactNumber=new ArrayList<String>();
	private String emailAddress="none found";
	
	public void addNumber(String number) {
		this.contactNumber.add(number);
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
	
	public ArrayList<String> getContactNumber() {
		return contactNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int compareTo(Person second){
		return(this.getFirstName().compareTo(second.getFirstName()));
	}

	
	@Override
	public String toString() {
	return ("-------- * -------- * -------- * --------"
	+"\n"+"firstName : " + firstName +"\n"+ "lastName : "
			+ lastName +"\n"+ "contactNumber : " 
	+ contactNumber+"\n"+ "emailAddress : " 
			+ emailAddress +"\n"
	+ "-------- * -------- * -------- * --------");
	}
	

}
