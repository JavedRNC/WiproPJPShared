import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HOA2 {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] charArray = str.toCharArray();
		Arrays.parallelSort(charArray);

		System.out.println(String.valueOf(charArray));
	}
}
