
import java.util.Optional;

public class Hoa1 {

    public static void main(String[] args) {
        
        String names[] = new String[5];
        Optional<String> n = Optional.ofNullable(names[0]);
        System.out.println(n.get().length());
        
    }
    
}
