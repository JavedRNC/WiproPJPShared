import java.util.*;
import java.util.Map.Entry;

public class HOA2 {

	public static void main(String[] args) {
		
		boolean doesKeyExists = false;
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("India", "Delhi");
		hashMap.put("Japan", "Tokyo");
		hashMap.put("Bangladesh", "Dhaka");
		
		
		Set set = hashMap.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			
			if (me.getKey().equals("Japan")) {
				doesKeyExists = true;
				System.out.println("Key exists");
				break;
			}
		}
		
		if(!doesKeyExists)
		{
			System.out.println("Key does not exist !");
		}
		
		
		set = hashMap.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();
			
			if (me.getValue().equals("Delhi")) {
				System.out.println("Value exists");
				break;
			}
		}
		
		
		set = hashMap.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me);
			//System.out.println("Key: " + me.getKey() + ", Value: " + me.getValue());
		}
	}

}
