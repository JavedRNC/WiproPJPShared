import java.util.Scanner;

class HOA1
{ 
    public static void main(String args[])
{
    try {
        System.out.println("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());    
        System.out.println("The square value is " + num*num);
        System.out.println("The work has been done successfully");
    } 
    
    catch(NumberFormatException e) {
    System.out.println("Entered input is not a valid format for an integer.");
        
    } 
}
    
    
}