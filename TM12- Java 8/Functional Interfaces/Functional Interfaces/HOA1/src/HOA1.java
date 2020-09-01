import java.util.ArrayList;
import java.util.function.Function;

class Employee
{
	int id;
	String name;
	String location;
	double salary;
	public Employee(int id, String name, String location, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static ArrayList<String> locations(ArrayList<Employee> al)
	{
		ArrayList<String> aList = new ArrayList<>();
		for(Employee emp: al)
		{
			aList.add(emp.location);
		}
		
		return aList;
	}
	
}

public class HOA1 {

	public static void main(String[] args) {
		
		ArrayList<Employee> aList = new ArrayList<Employee>();
		aList.add(new Employee(1,"Javed","Delhi",85000));
		aList.add(new Employee(2,"Shahid","Hyderabad",90000));
		aList.add(new Employee(3,"Arman","Ranchi",85000));
		
		Function<ArrayList<Employee>, ArrayList<String>> fun = Employee::locations;
		ArrayList<String> locationList = new ArrayList<String>();
		locationList = fun.apply(aList);
		locationList.forEach(System.out::println);
		
		
		
		

	}

}
