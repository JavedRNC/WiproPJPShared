import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;


class myTreeSet
{
	Set<String> treeset = new TreeSet<String>();
	public TreeSet<String> saveCountryNames(String CountryName)
	{
		treeset.add(CountryName);
		return (TreeSet<String>)treeset;
	}
	
	public String getCountry(String CountryName)
	{
		Iterator<String> itr = treeset.iterator();
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

public class HOA4 {

	public static void main(String[] args) {
		myTreeSet T1 = new myTreeSet();
		T1.saveCountryNames("India");
		T1.saveCountryNames("Canada");
		T1.saveCountryNames("UAE");
		
		System.out.println(T1.getCountry("India"));
		System.out.println(T1.getCountry("UAE"));
		System.out.println(T1.getCountry("England"));
		
	}
}
