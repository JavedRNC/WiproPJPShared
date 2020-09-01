import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employee
{
	String firstName;
	String lastName;
	String mobileNumber;
	String email;
	String address;
}

class firstNameSorter implements Comparator<Employee>
{
	    public int compare(Employee o1, Employee o2) {
		return o1.firstName.compareTo(o2.firstName);
		}
}


class TM07_proj1
{
	public static void main(String[] args)
	{
		List<Employee> employees = new ArrayList<Employee>();
		System.out.println("Enter the Number of Employees");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<no;i++)
		{
			Employee emp = new Employee();
			System.out.println("Enter Employee "+ (i+1) + " Details");
			System.out.println("Enter the FirstName");
			emp.firstName = sc.nextLine();
			System.out.println("Enter the LastName");
			emp.lastName = sc.nextLine();
			System.out.println("Enter the Mobile");
			emp.mobileNumber = sc.nextLine();
			System.out.println("Enter the Email");
			emp.email = sc.nextLine();
			System.out.println("Enter the Address");
			emp.address = sc.nextLine();
			employees.add(emp);
			
		}
		
		Collections.sort(employees, new firstNameSorter());
		
		Iterator<Employee> itrIterator = employees.iterator();
		while(itrIterator.hasNext())
		{
			Employee emp = itrIterator.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.firstName,emp.lastName,emp.mobileNumber,emp.email,emp.address);
		}
		
	}
}
	
