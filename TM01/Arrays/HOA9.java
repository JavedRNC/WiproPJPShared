public class HOA9
{
	public static void main(String[] args)
	{
		if(args.length!=4)
		{
		System.out.println("Please input 4 integers.");
		}
		else
		{	System.out.println("The given array is: ");
			for(int i=0;i<args.length;i++)
			{
				System.out.print(args[i]+ " ");
				if(i==1)
					System.out.println();
			}
			System.out.println("\nThe reverse of the array is: ");
			for(int i=args.length-1;i>=0;i--)
			{
				System.out.print(args[i]+ " ");
				if(i==2)
					System.out.println();
			}
		}
	}
}