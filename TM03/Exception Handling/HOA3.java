import java.util.*;

class HOA3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int num = sc.nextInt();
		int[] arr = new int[num];
		sc.nextLine();
		
		System.out.println("Enter the elements in the array:");
		try {
		for(int i=0;i<num;i++)
		{
		    arr[i] = Integer.parseInt(sc.nextLine());
			sc.nextLine();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
		
		    System.out.println("The array element at index "+index+" = "+arr[index]);
		    System.out.println("The array element successfully accessed");
		    
		} catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} 
		
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException");
		}
	
}

}