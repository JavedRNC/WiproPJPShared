import java.util.*;

class HOA9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings separated by comma:");
		String Str = sc.nextLine();
		String[] tempArray = Str.split(",");
		String resString="";
		int i=0;
		while(tempArray[0].length()>i || tempArray[1].length()>i)
		{
			if(i<tempArray[0].length())
				resString = resString + tempArray[0].charAt(i);
			if(i<tempArray[1].length())
				resString = resString + tempArray[1].charAt(i);
			i++;
		}
		System.out.println(resString);
		
	}
}