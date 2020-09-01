
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOA2 {

    public static void main(String[] args) {
       String[] str = {"Mango","Orange","Peach","Guava","Cucumber","Potatao","Grapes","Apple","Banana","Blackberry"};
       List<String> list = Arrays.asList(str);
       ArrayList<String> al = new ArrayList<String>();
       al.addAll(list);
       ArrayList<String> al2 = new ArrayList<String>();
       al.forEach(n-> {
           String reversedString = "";
           for(int i = n.length()-1;i>=0;i--)
           {
               reversedString = reversedString + n.charAt(i);
           }
           al2.add(reversedString);
       });
        al2.forEach(n -> {
            System.out.println(n);
        });
    }
    
}
