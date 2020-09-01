import java.util.ArrayList;
import java.util.function.Supplier;

public class HOA8 {

	public static void main(String[] args) {

		Supplier<ArrayList<Integer>> al = () -> {
			ArrayList<Integer> aList = new ArrayList<>();
			int count = 0;
			for (int i = 2; count != 10; i++) {
				boolean isPrime = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;

					}
				}

				if (isPrime) {
					aList.add(i);
					count++;
				}
			}

			return aList;
		};

		System.out.println(al.get());
	}
}
