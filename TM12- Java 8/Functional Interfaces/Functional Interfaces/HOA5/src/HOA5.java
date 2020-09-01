import java.util.ArrayList;
import java.util.function.Predicate;

public class HOA5 {

	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(64);
		arrList.add(36);
		arrList.add(44);
		arrList.add(296);
		arrList.add(169);
		arrList.add(10);
		arrList.add(25);
		arrList.add(35);
		arrList.add(23);
		arrList.add(81);

		Predicate<Integer> p = i -> {
			if (Math.sqrt(i) - Math.floor(Math.sqrt(i)) == 0)
				return true;
			return false;

		};

		arrList.stream().filter(p).forEach(System.out::println);

	}
}
