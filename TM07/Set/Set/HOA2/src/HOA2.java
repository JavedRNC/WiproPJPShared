import java.util.HashSet;
import java.util.Iterator;

public class HOA2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Javed");
		set.add("Shahid");
		set.add("Aatifa");
		set.add("Arman");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}
