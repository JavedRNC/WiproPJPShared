import java.util.*;

public class HOA3 {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("West Bengal", "Kolkata");
		properties.setProperty("Rajasthan", "Jodhpur");
		properties.setProperty("Bihar", "Patna");
		
		Set set = properties.entrySet();
		Iterator itrIterator = set.iterator();
		
		while(itrIterator.hasNext())
		{
			System.out.println(itrIterator.next());
			
		}
		}
	}


