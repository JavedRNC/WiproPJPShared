import java.util.Arrays;

public class HOA1 {

	public static void main(String[] args) {

		int[] al = { 22, 31, 12, 45, 20, 98, 56, 74, 23, 59 };
		Arrays.parallelSort(al);
		int sum = al[0] + al[al.length - 1];
		System.out.println(sum);

	}

}
