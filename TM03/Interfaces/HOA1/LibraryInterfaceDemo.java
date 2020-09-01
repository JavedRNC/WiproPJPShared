interface LibraryUser
{
	void registerAccount();
	void requestBook();
}

class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	public KidUsers(int age, String bookType)
	{
		
		this.age = age;
		this.bookType = bookType;
	}
	public void registerAccount()
	{
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook()
	{
		if(bookType.equalsIgnoreCase("Kids"))
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
	
}

class AdultUsers
{
	int age;
	String bookType;
	public AdultUsers(int age, String bookType)
	{
		
		this.age = age;
		this.bookType = bookType;
	}
	public void registerAccount()
	{
		if(age>12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requestBook()
	{
		if(bookType.equalsIgnoreCase("Fiction"))
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}

class LibraryInterfaceDemo
{
	public static void main(String[] args)
	{
		KidUsers kid = new KidUsers(10,"kids");
		kid.registerAccount();
		kid.requestBook();
		AdultUsers adult = new AdultUsers(14,"fiction");
		adult.registerAccount();
		adult.requestBook();
	}
}