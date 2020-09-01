import java.util.*;
class HOA3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String tempStr = sb.substring(0,2).toString();
		String tempStr2 = "";
		for(int i=0;i<sb.length();i++)
		{
			tempStr2 = tempStr2 + tempStr;
		}
		System.out.println(tempStr2);
		
	}
}