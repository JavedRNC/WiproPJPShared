import java.util.InputMismatchException;
import java.util.Scanner;

public class HOA3 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an integer between 1 to 255");
			int num = sc.nextInt();
			Integer i = num;
			if(num>0 && num<256)
			{
				String str = Integer.toBinaryString(i);
				String finalString = String.format("%08d", Integer.parseInt(str));
				System.out.println(finalString);
				
			}
			else {
				System.out.println("Please enter integer between 1 to 255 !");
				System.exit(2);
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid input !");
		}
		
		
		

	}

}
