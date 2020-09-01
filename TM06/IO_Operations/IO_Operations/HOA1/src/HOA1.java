import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class HOA1 {

   public static void main(String args[]) throws IOException {
	   System.out.println("Enter the input file name");
	   Scanner sc = new Scanner(System.in);
	   String fileName = sc.nextLine();
	   File inputFile = new File(fileName);
	   FileReader fin = new FileReader(inputFile);
	   System.out.println("Enter the character to be counted");
	   char d = sc.next().charAt(0);
	   int count=0,c;
	   while((c=fin.read())!=-1)
	   {
		   if((c)==Character.toLowerCase(d) || (c)==Character.toUpperCase(d))
		     count++;  
	   }
	   
	   System.out.println("File \'" + fileName + "\' has " + count+" instances of letter \'"+ d + "\'.");
	   
	   
   }
}

