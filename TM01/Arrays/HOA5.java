import java.util.*;

public class HOA5
{
	public static void main(String args[])
	{
		int arr[] = {41,65,44,99,30,76};
		int min1 = arr[0];
		int min2 = arr[0];
		int max1 = 0;
		int max2 = 0;
		int countMin = 0;
		int countMax = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min1)
				min1 = arr[i];						
		}
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<min2 && arr[i]!=min1)
			{
					min2 = arr[i];
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>max1)
				max1 = arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=max1 && arr[i]>max2)
			{
					max2 = arr[i];
			}
		}
		
		System.out.println("1st minimum & 2nd minimum is: "+ min1 + " , " + min2);
		System.out.println("1st maximum & 2nd maximum is: "+ max1 + " , " + max2);
	}
}