import java.util.*;

class DivideByZeroException extends Exception
{
	public String toString()
	{
		return "DivideByZeroException caught";
	}
}

class HOA9
{
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			try
			{
				if(b==0)
					throw new DivideByZeroException();
				else
				System.out.printf("The quotient of %d/%d is %d\n",a,b,a/b);
			}
			
			catch(DivideByZeroException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Inside finally block");
			}
	}
}