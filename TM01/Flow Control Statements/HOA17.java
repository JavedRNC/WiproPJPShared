import java.util.*;

public class HOA17
{
	public static void main(String args[])
	{	int num = Integer.parseInt(args[0]);	
		int revNumber = 0;
		int weight=1;
		int rem;
		int temp = num;
		while(temp!=0)
		{
			weight = weight*10;
			temp = temp/10;
		}
		weight = weight/10;
		
		while(num!=0)
		{
			rem = num%10;
			revNumber = revNumber + weight*rem;
			weight/=10;;
			num/=10;
		}
		
		System.out.println(revNumber);
	}
}
	
