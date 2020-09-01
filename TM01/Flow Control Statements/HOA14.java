import java.util.*;

public class HOA14
{
	public static void main(String args[])
	{		boolean isPrime = true;
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter an integer number.");
			int num = s.nextInt();
			if(num==0 || num==1)
			{
				System.out.println(num + " is neither prime nor composite.");
				System.exit(0);
			}
			for(int j=2;j<num;j++)
			{	
				if(num%j==0)
				{  
					isPrime = false;
					break;
				}
   			}
			if(!isPrime)
			{
				System.out.println(num + " is not a prime number");
			}
			else
				System.out.println(num + " is a prime number");
			
	}
}
	
