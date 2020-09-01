
import java.util.ArrayList;
import java.util.Arrays;


public class HOA3 {

   
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("Farrukhabad","Kanpur","Allahabad","Chunar","Chopan","Garhwa","Barwadih","Ray","Barkakana","Ranchi"));
        words.forEach(x -> 
        {
            if(x.length()%2!=0)
            {
                System.out.println(x); 
            }
                });
    }
    
}
