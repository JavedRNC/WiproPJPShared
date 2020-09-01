import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class HOA2 {
	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("-");
		StringJoiner s2 = new StringJoiner("-");
		List<String> cities1 = Arrays.asList("Delhi", "Hyderabad", "Bangalore");
		List<String> cities2 = Arrays.asList("Farrukhabad", "Fatehgarh", "Ranchi");
		cities1.forEach(city -> s1.add(city));
		cities2.forEach(city -> s2.add(city));
		s1.merge(s2);
		System.out.println(s1);
		s2.merge(s1);
		System.out.println(s2);

	}
}
