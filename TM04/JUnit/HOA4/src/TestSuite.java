import java.util.ArrayList;

public class TestSuite {

	public boolean palindromeCheck(String str)
	{
		char arr[] = str.toCharArray();
		int i=arr.length-1;
		int flag = 1;
		for(int j=0;j<arr.length;j++,i--)
		{
			if(arr[j] == arr[i])
				continue;
			else
			{
				flag = 0;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
			
		}
	
	public String findName(ArrayList employees,String name)
	{
		String result = "";
		if(employees.contains(name))
		{
			result = "FOUND";
		}
		else
		{
			result = "NOT FOUND";
		}
		return result;
	}
	
	public String stringConcat(String str1,String str2)
	{
		return str1+str2;
	}
	
}
