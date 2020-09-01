import java.util.Scanner;

class InvalidCountryException extends Exception
{	String strExc ="";
	InvalidCountryException(String s)
	{
		strExc = s;
	}
	
	public String toString()
	{
		return strExc;
	}
}

class UserRegistration
{	
	void registerUser(String username,String userCountry)
	{	
	try
	{
		if(userCountry.equalsIgnoreCase("India"))
		{
			System.out.println("User registration done successfully!");
		}
		else
			throw new InvalidCountryException("User outside India cannot be registered");
	}
	catch(InvalidCountryException e)
	{
		System.out.println(e);
	}
	}
	
}

class HOA7
{
	public static void main(String[] args)
	{
		UserRegistration reg = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		String Input = sc.nextLine();
		String[] arr = Input.split(",");
		
		reg.registerUser(arr[0],arr[1]);
	}
}