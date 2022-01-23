package contactproject;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		ContactsManager myContactsManager=new ContactsManager();
		
		Contact contact1=new Contact();
		contact1.name="Ali Can";
		contact1.phoneNumber="+90555256536";
		
	myContactsManager.addContact(contact1);
				
		Contact contact2=new Contact();
		contact2.name="Veli Han";
		contact2.phoneNumber="+49526325452";
	
	myContactsManager.addContact(contact2);
	
	Contact contact3=new Contact();
	contact3.name="Deli Kan";
	contact3.phoneNumber="+125526325452";
	
	myContactsManager.addContact(contact3);
	
	Contact result = myContactsManager.searchContact("Ali Can");
	
	System.out.println(result.phoneNumber);
	
	
	}

}
