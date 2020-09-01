import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HOA1 {
	
	HashMap<String,String> M1 = new HashMap<String, String>();
	public HashMap<String, String> saveCountryCapital(String country, String capital)
	{
		
		M1.put(country, capital);
		return M1;
		
	}
	
	public String getCapital(String countryName)
	{
		Set set = M1.entrySet();
		Iterator itrIterator = set.iterator();
		while(itrIterator.hasNext())
		{
			Map.Entry mEntry = (Map.Entry)itrIterator.next();
			if(mEntry.getKey()==countryName)
			{
				return (String)mEntry.getValue();
			}
		}
		
		return null;
	}
	
	public String getCountry(String capitalName) {
		
		Set set = M1.entrySet();
		Iterator itrIterator = set.iterator();
		while(itrIterator.hasNext())
		{
			Map.Entry mEntry = (Map.Entry)itrIterator.next();
			if(mEntry.getValue()==capitalName)
			{
				return (String)mEntry.getKey();
			}
		}
		
		return null;
		
	}
	
	HashMap<String, String> M2 = new HashMap<String, String>();
	public HashMap<String, String> reverseMap1()
	{
		Set set = M1.entrySet();
		Iterator itrIterator = set.iterator();
		while(itrIterator.hasNext())
		{
			Map.Entry meEntry = (Map.Entry)itrIterator.next();
			M2.put(meEntry.getValue().toString(), meEntry.getKey().toString());
		}
		
		return M2;
	}
	
	ArrayList<String> arrayList = new ArrayList<String>();
	public ArrayList<String> Map1toArrayList()
	{
		
		Set set = M1.entrySet();
		Iterator itrIterator = set.iterator();
		while(itrIterator.hasNext())
		{
			Map.Entry mEntry = (Map.Entry)itrIterator.next();
			arrayList.add(mEntry.getKey().toString());
			
		}
		
		return arrayList;
		
	}
	
public static void main(String[] args) {

	HOA1 obj = new HOA1();
	obj.saveCountryCapital("India", "Delhi");
	obj.saveCountryCapital("Afghanistan", "Kabul");
	obj.saveCountryCapital("Japan", "Tokyo");
	System.out.println("------TESTING getCountry() METHOD-------");
	System.out.println(obj.getCountry("Tokyo"));
	System.out.println("----TESTING getCapital() METHOD-----");
	System.out.println(obj.getCapital("Japan"));
	System.out.println("---TESTING METHOD reverseMap1()---");
	obj.reverseMap1();
	Set set = obj.M2.entrySet();
	Iterator itrIterator = set.iterator();
	while(itrIterator.hasNext())
	{
		Map.Entry meEntry = (Map.Entry)itrIterator.next();
		System.out.println("Key: "+meEntry.getKey()+", Value: "+meEntry.getValue());
	}
	
	System.out.println("---TESTING METHOD 4 Map1toArrayList()---");
	obj.Map1toArrayList();
	System.out.println(obj.arrayList);
	
	
}
}
