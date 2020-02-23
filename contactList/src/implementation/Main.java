package implementation;
import java.util.*;
import contactList.ContactList;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ContactList contacts = new ContactList();
		while(true) {
			System.out.println("welcome to DBC's Contact List App");
			System.out.println("Press 1 to add a new contact");
			System.out.println("Press 2 to view all contact");
			System.out.println("Press 3 to search for a contact");
			System.out.println("Press 4 to delete a contact");
			System.out.println("Press 5 to exit program");
			String input = scan.nextLine();
			if(input.equals("1")) {
				contacts.add();
			}
			else if(input.equals("2")) {
				contacts.view();
			}
			else if(input.equals("3")) {
				contacts.search();
			}
			else if(input.equals("4")) {
				contacts.delete();
			}
			else if(input.equals("5")){
				break;
			}
			else {
				System.out.println("Please enter a valid value");
			}
		
		}
		scan.close();

	}

}
