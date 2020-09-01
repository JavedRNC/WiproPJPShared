import java.util.*;

public class HOA18
{
	public static void main(String args[])
	{	int num = Integer.parseInt(args[0]);	
		int revNumber = 0;
		int weight=1;
		int rem;
		int temp = num;
		int temp2 = num;
		while(temp!=0)
		{
			weight = weight*10;
			temp = temp/10;
		}
		weight = weight/10;
		
		while(temp2!=0)
		{
			rem = temp2%10;
			revNumber = revNumber + weight*rem;
			weight/=10;;
			temp2/=10;
		}
		if(num == revNumber)
		System.out.println(num + " is a palindrome");
		else
		System.out.println(num + " is not a palindrome");
	}
}
	
