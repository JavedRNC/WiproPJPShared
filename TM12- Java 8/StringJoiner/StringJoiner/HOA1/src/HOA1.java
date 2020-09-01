import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.StringJoiner;

public class HOA1 {
	public static void main(String[] args) {

		Collection<String> names = new ArrayList<String>(Arrays.asList("Javed", "Shahid", "Aatifa", "Hina", "Mehvish",
				"Sarfaraz", "Muskan", "Raunak", "Ashraf", "Arman", "Lukman", "Arshad", "Ruby"));
		StringJoiner s1 = new StringJoiner(", ", "{", "}");
		names.forEach(name -> s1.add(name));
		System.out.println(s1);

	}
}
