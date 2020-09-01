import java.util.*;

public class HOA7
{
	public static void main(String args[])
	{
		int arr[] = {10,65,44,99,30,10,65,44,100,100,100,65,99,98};
		int newArr[] = new int[arr.length];
		int j = 0;
		
		for(int val: arr)
		{	boolean isPresent = false;
			for(int i = 0;i<newArr.length;i++)
			{
				if(newArr[i]==val)
				{	isPresent = true;
					break;
				}
				
			}
			if(!isPresent)
					newArr[j++] = val;
			
			
		}
		
		for(int i = 0;i<j;i++)
		{
			arr[i] = newArr[i];
		}
		for(int i=j;i<arr.length;i++)
			arr[i] = Integer.MAX_VALUE;
		
		
		for(int i=0;i<j;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
}