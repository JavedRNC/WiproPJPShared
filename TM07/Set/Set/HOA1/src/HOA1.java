import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


class myHashSet
{
	Set<String> hashset = new HashSet<String>();
	public HashSet<String> saveCountryNames(String CountryName)
	{
		hashset.add(CountryName);
		return (HashSet<String>) hashset;
	}
	
	public String getCountry(String CountryName)
	{
		Iterator<String> itr = hashset.iterator();
		while(itr.hasNext())
		{
			if(itr.next().equals(CountryName))
			{
				return CountryName;
			}
		}
		
		return null;
	}
}

public class HOA1 {

	public static void main(String[] args) {
		myHashSet H1 = new myHashSet();
		H1.saveCountryNames("India");
		H1.saveCountryNames("Canada");
		H1.saveCountryNames("UAE");
		
		System.out.println(H1.getCountry("India"));
		System.out.println(H1.getCountry("UAE"));
		System.out.println(H1.getCountry("England"));
		
	}
}
