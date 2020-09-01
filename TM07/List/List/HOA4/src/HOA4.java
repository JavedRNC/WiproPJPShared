import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class HOA4 {

	public static void main(String[] args) {
		List<Number> aList = new ArrayList<Number>();
		aList.add(2);
		aList.add(2.3f);
		aList.add(6.4);
		Iterator<Number> iterator = aList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
