import java.util.*;

public class HOA3 {
	
	public void printAll(List<String> al)
	{
		ListIterator<String> listIterator = al.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
	}

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		HOA3 obj = new HOA3();
		al.add("Red");
		al.add("Green");
		al.add("Yellow");
		obj.printAll(al);
		
	}
}
