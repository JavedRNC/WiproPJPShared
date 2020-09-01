import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class HOA3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList("ICICI", "SBS", "CBC", "Apple", "Day", "Not", "Non", "lol", "pick", "Tick"));
		Predicate<String> palindromic = x -> {
			StringBuffer sb = new StringBuffer(x);
			if (x.equals(sb.reverse().toString()))
				return true;
			return false;
		};
		al.stream().filter(palindromic).forEach(System.out::println);
	}
}