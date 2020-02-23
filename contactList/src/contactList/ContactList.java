package contactList;
import person.Person;
import java.util.*;
public class ContactList {
	
	private ArrayList<Person> contacts=new ArrayList<Person>();
	Scanner scan=new Scanner(System.in);
	
	public void add() {
		Person person = new Person();
		System.out.println("Plase enter the details of the person");
		System.out.print("First Name : ");
		person.setFirstName(scan.nextLine());
		System.out.println();
		System.out.print("Last Name : ");
		person.setLastName(scan.nextLine());
		System.out.println();
		System.out.print("Contact Number : ");
		person.addNumber(scan.nextLine());
		System.out.println();
		while(true) {
			
			System.out.print("Would you like to add another contact number ? (y/n) : ");
			String response = scan.nextLine();
			
			if (response.equals("y")) {
				System.out.print("Contact Number : ");
				person.addNumber(scan.nextLine());
				System.out.println();
			}
			
			else {
				break;
			}
			
		}
		
		System.out.print("Would you like to add an email address ? (y/n) : ");
		
		if(scan.nextLine().equals("y")) {
			System.out.println();
			System.out.print("Email Address : ");
			person.setEmailAddress(scan.nextLine());
		}
		
		contacts.add(person);
	
		Collections.sort(contacts);
		
	}
	
	public void view() {
		System.out.println("------Here are all your contacts------");
		int temp=contacts.size();
		System.out.println(temp);
		for(int i=0;i<temp;i=i+1) {
			
			System.out.println(contacts.get(i)+"\n");
		}
		
	}
	
	public void search() {
		
		String term =scan.nextLine();
		ArrayList<Person> searchResult = new ArrayList<Person>();
		int results=0;
		for(int i=0;i<contacts.size();i=i+1) {
			if (contacts.get(i).getFirstName().equals(term)) {
				results=results+1;
				searchResult.add(contacts.get(i));
			}
		}
		
		for(int i=0;i<searchResult.size();i=i+1) {
			System.out.println(searchResult.get(i)+"\n");
		}
	}
	
	public void delete() {
		System.out.println("Here are all your contacts : ");
		for(int i=0;i<contacts.size();i=i+1) {
			String name=contacts.get(i).getFirstName()+" "+contacts.get(i).getLastName();
			System.out.println((i+1)+". "+name);
		}
		System.out.println("Press the number against the contact to delete it : ");
		int deleting = scan.nextInt();
		if(deleting>0) {
		System.out.println(contacts.get(deleting-1).getFirstName()+" "+contacts.get(deleting-1).getFirstName()+"'s number deleted from the list");
		contacts.remove(deleting-1);
		}
		else {
			System.out.println("going back to main menu");
		}
	}
	
}
	

