
public class HOA2 {

	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]);
		Integer integer = i;
		System.out.println("Given Number: "+ integer);
		System.out.println("Binary Equivalent: " + Integer.toBinaryString(integer));
		System.out.println("Octal Equivalent: " + Integer.toOctalString(integer));
		System.out.println("Hexadecimal Equivalent: " + integer.toHexString(integer));
				
	}
}
