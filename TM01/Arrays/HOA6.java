import java.util.*;

public class HOA6
{
	public static void main(String args[])
	{
		int arr[] = {7,1,2,3,6};
		
		
		int index = 0;
		while(index<arr.length)
		{	
		int minIndex = 0;
		int minNumber=arr[index];
		for(int i = index;i<arr.length;i++)
		{
			if(arr[i]<minNumber)
			{
				minNumber = arr[i];
				minIndex = i;
			}			
		}
		
		System.out.print(minNumber + " ");
		
		arr[minIndex] = arr[index];
		
		index++;
		
		}
		
	}
}