import java.util.*;
public class HOA1
{
  public static void main (String[]args)
  {
    System.out.println("Enter a String:");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuffer sb = new StringBuffer(str);
    String strRev = sb.reverse().toString();
    if(str.equalsIgnoreCase(strRev))
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not Palindrome");
    }

  }
}
