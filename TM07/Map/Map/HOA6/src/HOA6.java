
import java.util.Hashtable;

public class HOA6 {

	public static void main(String[] args) {
		CountryMap countryMap6 = new CountryMap();

		countryMap6.saveCountryCapital("India", "Delhi");
		countryMap6.saveCountryCapital("Japan", "Tokyo");
		countryMap6.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap6.getCapital("India"));
		System.out.println(countryMap6.getCountry("Tokyo"));
		System.out.println(countryMap6.toArrayList());
		
		Hashtable<String, String> M2 = countryMap6.swapKyeValue();
		System.out.println(M2);
	}

}
