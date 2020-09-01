import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HOA1 {

	public static void main(String[] args) throws ParseException {
		try {
			Scanner sc = new Scanner(System.in);
			Employee emp = new Employee();	
			System.out.print("Enter name: ");
			emp.setName(sc.nextLine());
			System.out.print("Enter D.O.B. in format (dd/mm/yyyy): ");
			emp.setDateOfBirth(new SimpleDateFormat("dd/mm/yyyy").parse(sc.nextLine()));
			System.out.print("Enter department: ");
			emp.setDepartment(sc.nextLine());
			System.out.print("Enter designation: ");
			emp.setDesignation(sc.nextLine());
			System.out.print("Enter salary: ");
			emp.setSalary(sc.nextDouble());
			sc.nextLine();
			
			FileOutputStream fOutputStream = new FileOutputStream("data");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fOutputStream);
			objectOutputStream.writeObject(emp);
			
			FileInputStream fileInputStream = new FileInputStream("data");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Employee employee = (Employee)objectInputStream.readObject();
			
			System.out.println("Name: " + employee.getName());
			System.out.println("D.O.B.: " + employee.getDateOfBirth());
			System.out.println("Department: " + employee.getDepartment());
			System.out.println("Designation: " + employee.getDesignation());
			System.out.println("Salary: " + employee.getSalary());
			
		} catch (Exception e) {
			System.out.println("Please enter date as per required format ");
		}
		
		

	}

}
