import java.util.Arrays;

public class HOA3 {
	public static void main(String[] args) {
		int[] al = { 22, 31, 12, 45, 20, 98, 56, 74, 23, 59 };
		Arrays.parallelSort(al, 0, 5);
		for (int i : al) {
			System.out.println(i);
		}
	}
}
