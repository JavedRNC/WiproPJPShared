import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class HOA2 {

	public static Integer sumAll(ArrayList<Integer> al) {
		return al.stream().mapToInt(i -> i.intValue()).sum();
	}

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(23, 45, 67, 43, 23, 43, 12, 23, 34, 56));

		Function<ArrayList<Integer>, Integer> fun = HOA2::sumAll;
		System.out.println(fun.apply(intList));

	}

}
