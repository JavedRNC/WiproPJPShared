import java.util.*;
class HOA11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings separated by comma:");
		String str = sc.nextLine();
		String[] Str = str.split(",");
		String tempStr = "";
		while((Str[0].indexOf(Str[1]))!=-1)
		{
			int index1 = Str[0].indexOf(Str[1]);
			int index2 = (Str[0].indexOf(Str[1]))+Str[1].length();
			if(index1-1<0)
			{
				tempStr = tempStr + Str[0].charAt(index2);
			}
			else if(index2==Str[0].length())
			{
				tempStr = tempStr + Str[0].charAt(index1-1);
			}
			else
			tempStr = tempStr + Str[0].charAt(index1-1) + Str[0].charAt(index2);
			StringBuffer sb = new StringBuffer(Str[0]);
			sb.delete(index1,index2);
			Str[0] = sb.toString();
		}
		
		System.out.println(tempStr);
		
		
	}
}