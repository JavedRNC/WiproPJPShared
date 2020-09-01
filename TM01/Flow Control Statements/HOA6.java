import java.util.*;

public class HOA6
{
	public static void main(String args[])
	{
		if(args[0].equals("Male") && (Integer.parseInt(args[1])>=1 && Integer.parseInt(args[1])<=58))
		{
			System.out.println("The percentage of interest is: " + 8.4+"%");
		}
		else if(args[0].equals("Male") && (Integer.parseInt(args[1])>=59 && Integer.parseInt(args[1])<=100))
		{
			System.out.println("The percentage of interest is: " + 10.5+"%");
		}
		else if(args[0].equals("Female") && (Integer.parseInt(args[1])>=1 && Integer.parseInt(args[1])<=58))
		{
			System.out.println("The percentage of interest is: " + 8.2+"%");
		}
		else if(args[0].equals("Female") && (Integer.parseInt(args[1])>=59 && Integer.parseInt(args[1])<=100))
		{
			System.out.println("The percentage of interest is: " + 9.2+"%");
		}
	}
}