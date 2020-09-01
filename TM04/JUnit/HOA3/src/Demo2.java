
public class Demo2 {

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
	}

