import java.util.*;

public class EmployeeDB
{
	static List<Employee> al = new ArrayList<Employee>();
	boolean addEmployee(Employee e)
	{
		return al.add(e);
	}

	boolean deleteEmployee(int deleteEmpID)
	{	boolean status = false;
		EmployeeDB employeeDB = new EmployeeDB();
		ListIterator<Employee> li = employeeDB.al.listIterator();
		while(li.hasNext())
		{
		
		Employee employee = li.next();
		if(employee.empId==deleteEmpID)
		{	System.out.println("Successfully deleted !");
			status =  al.remove(employee);
			return status;
					
		}
		
				
		}
		System.out.println("Employee not found!");
		return status;
		
		
	}

	String showPaySlip(int paySlipToEmpId)
	{
		EmployeeDB employeeDB = new EmployeeDB();
		ListIterator<Employee> li = employeeDB.al.listIterator();
		while(li.hasNext())
		{
		
		Employee employee = li.next();
		if(employee.empId==paySlipToEmpId)
		{
			return "Salary of queried employee is" + employee.salary;
		}
		}
		
		return "Employee not found";
		
	}
}