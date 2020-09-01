import java.util.*;

class HOA7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String Str = sc.nextLine();
		if(Str.startsWith("x") && Str.endsWith("x"))
		{
			Str = Str.substring(1,Str.length()-1);
		}
		
		System.out.println(Str);
	}
}