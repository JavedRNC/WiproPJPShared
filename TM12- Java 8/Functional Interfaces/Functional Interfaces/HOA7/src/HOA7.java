import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class HOA7 {
	public static void main(String[] args) {

		Consumer<Integer> oddEven = i -> {
			if (i % 2 == 0)
				System.out.println("\"" + i + " is Even\"");
			else
				System.out.println("\"" + i + " is odd\"");

		};

		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(99, 26, 32, 41, 56, 68, 71, 84, 91, 29));
		al.forEach(n -> oddEven.accept(n));
	}
}
