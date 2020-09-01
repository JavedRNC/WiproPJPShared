class MathOperations
{
	public static void main(String[] args) {
	    int arr[] = new int[5];
	    int sum = 0;
		try{
		    for(int i=0;i<5;i++)
		    {   
		        arr[i] = Integer.parseInt(args[i]);
		        sum = sum + arr[i];
		    }
		    
		    double avg = sum/5.0;
		    System.out.println("The sum of the integers is:"+sum);
		    System.out.println("The average of the integers is:"+avg);
		    
		    
		}
		catch(ArithmeticException e)
		{
		    System.out.println("ArithmeticException found! Something happened wrong mathematically.");
		}
		
		catch(NumberFormatException e)
		{
		    System.out.println("NumberFormatException found! Please input integers correctly.");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
		    System.out.println("ArrayIndexOutOfBoundsException found! Please input 5 integers in command line.");
		}
	}
}
