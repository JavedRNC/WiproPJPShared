import java.util.*;

public class HOA3
{
	public static void main(String[] args)
	{	int sum = 0;
		int[] a = new int[]{2,0,-23,34,56,99,102,34};
		int num = 103;
		
		int index = -1;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				index = i;
		}
		
		if(index == -1)
			System.out.println(index);
		else
			System.out.println(index);
	}
}
