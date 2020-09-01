import java.util.*;
import java.util.stream.Collectors;

public class Hoa1 {

   public static void main(String[] args) {
       Integer arr[] = new Integer[]{23,-56,78,34,-65,-34,67,-45};      
        ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));
        
        List<Integer> al = aList.stream().filter(x-> x<0).collect(Collectors.toList());
        ArrayList<Integer> newAL = new ArrayList<Integer>(al);
        
        newAL.forEach(System.out::println);
        
        
    }
    
}
