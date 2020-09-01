import java.util.*;

public class HOA2
{
	public static void main(String[] args)
	{	int sum = 0;
		int[] a = new int[]{-23,67,34,-2,-234,12,56,87,99,34,56};
		int min = a[1];
		int max = a[1];
		for(int num: a)
		{
			if(num>max)
				max = num;
			else if(num<min)
				min = num;
		}
		
		System.out.println("Minimum value is : " + min);
		System.out.println("Maximum value is : " + max);
	}
}
