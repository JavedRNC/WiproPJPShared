import java.util.*;

class HOA6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First string:");
		String Str1 = sc.nextLine();
		System.out.println("Enter Second string:");
		String Str2 = sc.nextLine();
		String shortString = "";
		String longString = "";
		if(Str1.length()<Str2.length())
		{
			shortString = Str1;
			longString = Str2;
		}
		else
		{
				shortString = Str2;
				longString = Str1;
		}
		
		System.out.println(shortString+longString+shortString);
	}
}