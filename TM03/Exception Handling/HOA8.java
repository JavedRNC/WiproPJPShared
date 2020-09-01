class InvalidAgeException extends Exception
{		String err = "";
		InvalidAgeException(String str)
		{	
			err = str;
			
		}
		
		public String toString()
		{
			return err;
		}
}

class HOA8
{
	public static void main(String[] args)
	{	try
		{
		int age = Integer.parseInt(args[0]);
		
		if(age<18 || age>59)
				throw new InvalidAgeException("Age must be greater than 17 and smaller than 60");
		else
			System.out.println("Success");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please input age correctly");
		}
		
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
	
}