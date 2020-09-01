import java.util.ListIterator;
import java.util.Scanner;

public class Employee
{
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	void getEmployeeDetails()
	{	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee ID to get details:");
		int employeeID = scanner.nextInt();	
		scanner.nextLine();
		EmployeeDB employeeDB = new EmployeeDB();
		ListIterator<Employee> li = employeeDB.al.listIterator();
		while(li.hasNext())
		{
		Employee employee = li.next();
		if(employee.empId==employeeID)
		{
		System.out.println("Employee ID : " + employee.empId);
		System.out.println("Employee Name : " + employee.empName);
		System.out.println("Email : " + employee.email);
		System.out.println("Gender : "+employee.gender);
		System.out.println("Salary : "+employee.salary);
		System.out.println();
		return;
		}
		
		
		}
		System.out.println("Employee ID not found!");
	}
}
