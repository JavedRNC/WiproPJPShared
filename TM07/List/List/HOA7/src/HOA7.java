import java.util.Iterator;
import java.util.Vector;

public class HOA7 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Javed", "Rakabganj", 97000.0));
		list.add(new Employee(102, "Shahid", "Sufi Khan", 85000.0));
		list.add(new Employee(103, "Aatifa", "Ramzan Colony", 80000.0));
		list.add(new Employee(104, "Muskan", "Kalyanpur", 70000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}
