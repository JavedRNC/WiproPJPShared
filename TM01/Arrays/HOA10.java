public class HOA10
{
	public static void main(String[] args)
	{	int max = Integer.MIN_VALUE;
		if(args.length!=9)
		{
			System.out.println("Please input 9 integers");
		}
		System.out.println("The given array is:");
		for(int i=0;i<9;i++)
		{
			System.out.print(args[i] + " ");
			if(Integer.parseInt(args[i])>max)
				max = Integer.parseInt(args[i]);
			if(i==2 || i==5)
				System.out.println();
		}
		
		System.out.println("\nThe biggest element in the array is: " + max);
	}
}