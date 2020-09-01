import java.util.*;

class Division
{
    public void division(int a,int b) throws ArithmeticException
    {
        System.out.println(a/b);     
    }
    
}
public class HOA5
{
   
	public static void main(String[] args)  {
	    Division d= new Division();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter two integers:");
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    try {
	         d.division(a,b);
	    } catch(ArithmeticException e) {
	        System.out.println("ArithmeticException handled");
	    } 
	    
	    System.out.println("Normal flow continued");
	   
	    
	}
}
