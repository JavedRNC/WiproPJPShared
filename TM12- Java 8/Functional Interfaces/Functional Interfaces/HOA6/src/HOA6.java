import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class HOA6 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList("My", "name", "is", "Javed", "Wipro", "hired", "me", "as", "fresher", "provided"));
		Consumer<ArrayList<String>> revList = list -> {
			for (int i = 0; i < list.size(); i++) {
				StringBuffer sb = new StringBuffer(list.get(i));
				list.set(i, sb.reverse().toString());
			}
		};

		revList.accept(al);
		al.forEach(System.out::println);

	}
}
