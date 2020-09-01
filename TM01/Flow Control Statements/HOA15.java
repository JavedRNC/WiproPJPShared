import java.util.*;

public class HOA15
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int rem;
		for(int i=num;i!=0;i/=10)
		{
			rem = i%10;
			sum = sum+rem;
			
		}
		
		System.out.println(sum);
	}
}
	
