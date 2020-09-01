import java.util.*;

class NegativeValueException extends Exception
{
    public String toString()
    {
        return "NegativeValueException found! Negative value for marks are not allowed.";
    }
}



class OutOfRangeException extends Exception
{
    public String toString()
    {
        return "OutOfRangeException found! Please input marks between 0-100";
    }
}



public class HOA6
{
	public static void main(String[] args) {
	    try {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the first student:");
		String name1 = sc.nextLine();
		System.out.println("Enter the marks of  first student");
		int marks1 = Integer.parseInt(sc.nextLine());
		if(marks1<0)
		{
		    throw new NegativeValueException();
		}
		if(marks1>100)
		{
		    throw new OutOfRangeException();
		}
		System.out.println("Enter the name of the 2nd student:");
		String name2 = sc.nextLine();
		System.out.println("Enter the marks of 2nd student");
		int marks2 = Integer.parseInt(sc.nextLine());
		if(marks2<0)
		{
		    throw new NegativeValueException();
		}
		if(marks2>100)
		{
		    throw new OutOfRangeException();
		}
		float avg = (marks1+marks2)/2f;
		System.out.println("The average marks is:"+avg);
	    }
	    
	    catch(NumberFormatException e)
	    {
	        System.out.println("Please input marks correctly");
	    }
	    
	    catch(NegativeValueException e)
	    {
	        System.out.println(e);
	    }
	    
	    catch(OutOfRangeException e)
	    {
	       System.out.println(e); 
	    }
	}
}
