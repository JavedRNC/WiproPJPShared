import java.util.*;

public class HOA16
{
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		for(int i=1;i<=num;i++)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			
		}
	}
}
	
