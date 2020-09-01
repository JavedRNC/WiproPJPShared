import java.util.*;

public class HOA12
{
	public static void main(String args[])
	{	int num = Integer.parseInt(args[0]);
		boolean isPrime = true;
		int i;
		
	    if(num>0)
		{
		for(i=2;i<num;i++)
		{	if(num%i == 0)
			{	isPrime = false;
				System.out.println("Not a prime number");
				break;
			}
		}
		}
		if(num==1 || num==0)
		{
			System.out.println("Not a prime number");
		}
		
		
		else if(isPrime) 
		{
			System.out.println("Prime Number");
		}
		
		
	}
	
}