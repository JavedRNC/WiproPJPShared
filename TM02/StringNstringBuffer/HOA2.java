import java.util.*;

class HOA2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings separated by comma");
		String str = sc.nextLine();
		String[] arr = str.split(",");
		int len1 = arr[0].length()-1;
		if(arr[0].charAt(len1)==arr[1].charAt(0))
		{
			String str2 = arr[0]+arr[1];
			StringBuffer sb = new StringBuffer(str2);
			sb.delete(len1,len1+1);
			System.out.println(sb.toString().toLowerCase());
			
		}
		else
		{
			String str3 = arr[0] + " " + arr[1];
			System.out.println(str3.toLowerCase());
		}
		
		
	}
	
}