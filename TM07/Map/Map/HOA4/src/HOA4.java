public class HOA4 {

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Ambulance", 108);
		contactsList.addContact("Police", 100);
		contactsList.addContact("Fire", 101);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("101: " + contactsList.doesContactNumberExist(101));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}
