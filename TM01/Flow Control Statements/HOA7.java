import java.util.*;

public class HOA7
{
	public static void main(String args[])
	{
		char var = 'Z';
		char equiVal;
		if(var >= 65 && var<=97)
		{
			equiVal =  (char)(var +32);
			System.out.println((char)equiVal);
		}
		else if(var >=97 && var<=122)
		{
			equiVal = (char)(var-32);
			
			System.out.println(equiVal);
		}
	}
}