import java.util.*;
class HOA10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of repetitions: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String tempStr = sb.substring(sb.length()-n,sb.length()).toString();
		String tempStr2 = "";
		for(int i=0;i<n;i++)
		{
			tempStr2 = tempStr2 + tempStr;
		}
		System.out.println(tempStr2);
		
	}
}