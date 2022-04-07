
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	static ContactDetails person = new ContactDetails();
	/**
	 * Creating a List of ContactDetails of type String using ArrayList here Adding
	 * new elements in the List
	 */
	static List<ContactDetails> contactDetailsList = new ArrayList<ContactDetails>();
	static Scanner scanner = new Scanner(System.in);

	/**
	 * created method addNewContact() to create a new contacts to the AddressBook
	 */
	public void addContact() {
		System.out.println("Enter First Name : ");
		String firstName = scanner.next();
		System.out.println("Enter Last Name : ");
		String lastName = scanner.next();
		System.out.println("Enter Your Address : ");
		String address = scanner.next();
		System.out.println("Enter Your City : ");
		String city = scanner.next();
		System.out.println("Enter Your State");
		String state = scanner.next();
		System.out.println("Enter ZipCode : ");
		int zipCode = scanner.nextInt();
		System.out.println("Enter MobileNumber : ");
		long mobileNumber = scanner.nextLong();
		System.out.println("Enter your EmailId  : ");
		String emailId = scanner.next();

		person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
		contactDetailsList.add(person);
		printContact();

	}

	/**
	 * created method editContact() to editing the contacts
	 */
	public void editContact() {
		System.out.println("Enter the first name of person to edit Contact : ");
		String firstName = scanner.next();
		if (firstName.equalsIgnoreCase(person.getFirstName())) {
			addContact();
		} else {
			System.out.println("The Entered First Name Is Not Match");
			editContact();
		}
	}

	/**
	 * created method deleteContact() to deleting the contacts
	 */
	public void deleteContact() {
		System.out.println("Enter the First name of Person to Delete Contact : ");
		String deleteName = scanner.next();
		if (deleteName.equalsIgnoreCase(person.getFirstName())) {
			System.out.println("Deleted " + person.getFirstName() + " details");
			person = null;
		} else {
			System.out.println("The Entered First Name is Not Matched");
			deleteContact();
		}
	}

	/**
	 * created method printContact() to display all the contacts
	 */
	public static void printContact() {
		for (int i = 0; i < contactDetailsList.size(); i++) {
			person = contactDetailsList.get(i);
			System.out.println("Contact Details");
			System.out.println("Name          : " + person.getFirstName() + " " + person.getLastName() + "\n"
					+ "Address       : " + person.getAddress() + "\n" + "City          : " + person.getCity() + "\n"
					+ "State         : " + person.getState() + "\n" + "ZipCode       : " + person.getZipCode() + "\n"
					+ "MobileNumber  : " + person.getMobileNumber() + "\n" + "EmailId       : " + person.getEmailId()
					+ "\n");
		}
	}

}