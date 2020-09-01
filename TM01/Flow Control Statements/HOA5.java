import java.util.*;

public class HOA5
{
	public static void main(String args[])
	{
		char Char = '3';
		
		
		if(Char>=48 && Char<=57)
			System.out.println("Digit");
		else if((Char>=65 && Char<=90) || (Char>=97 && Char<=122))
			System.out.println("Alphabet");
		else
			System.out.println("Special Character");
	}
}