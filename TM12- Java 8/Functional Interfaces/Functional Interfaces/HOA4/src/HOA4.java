import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	private int id;
	private String name;
	private int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name;
	}

}

public class HOA4 {
	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Javed", 3000);
		Employee emp2 = new Employee(2, "Shahid", 4000);
		Employee emp3 = new Employee(3, "Aatifa", 50000);
		Employee emp4 = new Employee(4, "Nishat", 60000);
		Employee emp5 = new Employee(5, "Tabassum", 7000);

		List<Employee> employees = new ArrayList<Employee>(Arrays.asList(emp1, emp2, emp3, emp4, emp5));
		Predicate<Employee> p = x -> x.getSalary() < 10000;
		employees.stream().filter(p).forEach(System.out::println);

	}
}
