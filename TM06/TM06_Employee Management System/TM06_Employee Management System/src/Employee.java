import java.io.Serializable;

public class Employee implements Serializable {
	
	String name;
	int id;
	int age;
	double salary;
	
	public Employee() {
		this.name="";
		this.id=0;
		this.age=0;
		this.salary=0.0;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return id + " " + name + " " + age + " " + salary;
	}
}
