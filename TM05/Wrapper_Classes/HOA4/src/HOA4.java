import java.lang.Cloneable;

class Employee implements Cloneable
{
	String name;
	int id;
	
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}

public class HOA4 {
	public static void main(String args[]) throws CloneNotSupportedException
	{
	Employee emp1 = new Employee("Javed", 1);
	Employee emp2 = (Employee)emp1.clone();
	emp1.name = "Shahid";
	emp1.id = 765;
	System.out.println("emp1 name: " + emp1.name);
	System.out.println("emp1 id: " + emp1.id);
	System.out.println("emp2 name: " + emp2.name);
	System.out.println("emp2 id: " + emp2.id);
	}


}
