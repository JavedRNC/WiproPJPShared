import java.util.*;
import java.util.stream.Collectors;
class Employee
{
    int empNo;
    String name;
    int age;
    String location;  

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
        
    }

    @Override
    public String toString() {
        return "Employee{" + "empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + '}';
    }
    
    
    
}


public class HOA2 {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1,"Javed",24,"Hyderabad"));
        employees.add(new Employee(2,"Shahid",20,"Bangalore"));
        employees.add(new Employee(3,"Sarfaraz",27,"Pune"));
        employees.add(new Employee(4,"Sarwar",30,"Pune"));
        employees.add(new Employee(5,"Shoaib",25,"Pune"));
        
        List<Employee> tempfilteredList = employees.stream().filter(emp -> emp.location == "Pune").collect(Collectors.toList());
        ArrayList<Employee> filteredList = new ArrayList<Employee>(tempfilteredList);
        filteredList.forEach(System.out::println);
        
    }
    
}
