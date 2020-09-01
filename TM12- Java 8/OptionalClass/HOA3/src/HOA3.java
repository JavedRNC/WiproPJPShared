
import java.util.Optional;

class Employee
{
    String address;
}
public class HOA3 {

   
    public static void main(String[] args) {
        try {
            Employee obj = new Employee();
        Optional<String> n = Optional.ofNullable(obj.address);
        if(n.isPresent())
        {
            
        }
        else
            throw new InvalidEmployeeException();
        }
         catch (InvalidEmployeeException e) {
    
    System.out.print(e);
        }
        
    }    

}

  class InvalidEmployeeException extends Exception
    {
        public String toString()
        {
return "Invalid Employee Exception caught"; 
        }
    
    }
