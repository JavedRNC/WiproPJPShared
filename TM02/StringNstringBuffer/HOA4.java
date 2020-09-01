import java.util.*;

class HOA4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String Str = sc.nextLine();
		int length = Str.length();
		if(length%2!=0)
		{
			System.out.println("null");
		}
		else
		{
			System.out.println(Str.substring(0,length/2));
		}
	}
}