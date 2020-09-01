import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class HOA2
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		
		EmployeeDB empdb = new EmployeeDB();
		int choice;
		do
		{
		System.out.println("1.Add employee");
		System.out.println("2.Delete employee");
		System.out.println("3.Show Pay Slip");
		System.out.println("4.Show Employees");
		System.out.println("5.Press any other to exit");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:	
			{	Employee emp = new Employee();
				System.out.println("Enter Employee ID:");
				emp.empId = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name:");
				emp.empName = sc.nextLine();
				System.out.println("Enter Email:");
				emp.email = sc.nextLine();
				System.out.println("Enter your gender:");
				emp.gender = sc.nextLine();
				System.out.println("Enter Salary:");
				emp.salary = sc.nextFloat();
				empdb.addEmployee(emp);
				System.out.println("Successfully Added !");
				break;
		}
		
		case 2:
		{
			System.out.println("Enter employee ID to be deleted:");
			int id = sc.nextInt();
			empdb.deleteEmployee(id);
			break;
		}
		case 3:
		{
			System.out.println("Enter employee id");
			int id= sc.nextInt();
			System.out.println(empdb.showPaySlip(id));
			break;
		}
		case 4:
		{	Employee emp = new Employee();
			emp.getEmployeeDetails();
			break;
			
		}
			}
		
		} while(choice==1 || choice==2 || choice==3 || choice==4);
		System.out.println("Thanks for using the application ! Exiting !!!");
		TimeUnit.SECONDS.sleep(3);
		
	}
}
	
