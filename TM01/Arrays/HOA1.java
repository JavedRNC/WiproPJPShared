import java.util.*;

public class HOA1
{
	public static void main(String[] args)
	{	int sum = 0;
		int[] a = new int[]{1,2,3,4,5,4,3,2,1};
		for(int num: a)
		{
			sum = sum + num;
		}
		
		double avg = (double)sum/(a.length);
		System.out.println("Sum is : " + sum);
		System.out.println("Average is : "+ avg);
	}
}
