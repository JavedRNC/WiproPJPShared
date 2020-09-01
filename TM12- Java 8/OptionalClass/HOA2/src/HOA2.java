
import java.util.Optional;

public class HOA2 {
String address ;
    public static void main(String[] args) {
       HOA2 obj = new HOA2();
       Optional<String> n = Optional.ofNullable(obj.address);
        System.out.println(n.orElse("India"));
    }
    
}
