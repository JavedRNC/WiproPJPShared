import java.util.*;

public class HOA3
{
	public static void main(String args[])
	{
		if(args.length == 0)
		{
			System.out.println("No values");
		}
		
		else
		{	int count = 1;
			for(String str: args)
			{
				if(count<(args.length))
				{	System.out.print(str + ",");
					count++;
				}
				else
					System.out.print(str);
			}
				
		}
	}
}