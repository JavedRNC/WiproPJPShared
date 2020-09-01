import java.util.*;

class Employee
{
    int id;
    String name;
    String address;
    double salary;

    public Employee(int id, String name, String address, double salary) {
       
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "Id:" + id+", Name:" + name + ", Address:" + address + ", Salary:" + salary;
    }
    
    
}

public class HOA2 {
    
    public static void main(String[] args) {
        
      ArrayList<Employee> employees = new ArrayList<Employee>();
      Employee emp1 = new Employee(1, "Javed", "Cannaught Place", 30000.99);
      Employee emp2 = new Employee(2, "Shahid", "Delhi", 40000);
      Employee emp3 = new Employee(3, "Aatifa", "Hyderabad", 20000);
      Employee emp4 = new Employee(4, "Hina", "Jharsuguda", 20000);
      Employee emp5 = new Employee(5, "Safina", "Bhuvaneshwar", 15000);
        
      employees.add(emp1);
      employees.add(emp2);
      employees.add(emp3);
      employees.add(emp4);
      employees.add(emp5);
      
      employees.forEach(employee -> { System.out.println(employee); });
      
      
    }
    
}
