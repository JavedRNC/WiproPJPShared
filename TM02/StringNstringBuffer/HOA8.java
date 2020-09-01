import java.util.*;

class HOA8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with a * in it:");
		String Str = sc.nextLine();
		StringBuffer sb = new StringBuffer(Str);
		int index = sb.indexOf("*");
		sb.delete(index-1,index+2);
		System.out.println(sb);
		
	}
}