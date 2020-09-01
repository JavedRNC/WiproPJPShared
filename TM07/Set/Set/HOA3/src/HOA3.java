import java.util.*;


public class HOA3 {
public static void main(String[] args) {
	Set<String> treeSet = new TreeSet<String>();
	treeSet.add("Red");
	treeSet.add("Green");
	treeSet.add("Yellow");
	Iterator<String> itr = treeSet.iterator();
	String str = "Green";
	boolean result = false;
	
	while (itr.hasNext()) {
		if (itr.next().equals(str)) {
			result = true;
			break;
		}
	}
	
	if (result==true)
		{
			System.out.println(str + " exists");
		}
	else 
		{
			System.out.println(str + " doesn't exist");
		}
}
}
