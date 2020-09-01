import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Employee implements Serializable  {
	String name;
	Date dateOfBirth;
	String department;
	String designation;
	double salary;



Employee() throws Exception
{
	name = "Javed";
	dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1999");
	department = "IT";
	designation = "Student";
	salary = 99000;
	
	
}

Employee(String name,Date dateOfBirth,String department,String designation,double salary)
{
	
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.department = "IT";
	this.designation = "Student";
	this.salary = 0.0;
}


public void setName(String name)
{
	this.name = name;
}

public void setDateOfBirth(Date dateOfbirth)
{
	this.dateOfBirth = dateOfbirth;
}

public void setDepartment(String department)
{
	this.department = department;
}

public void setSalary(double salary)
{
	this.salary = salary;
}

public void setDesignation(String designation)
{
	this.designation = designation;
}

public String getName()
{
	return name;
}

public String getDateOfBirth()
{
	return new SimpleDateFormat("dd/mm/yyyy").format(dateOfBirth);
}

public String getDepartment()
{
	return department;
}

public String getDesignation()
{
	return designation;
	
}
public double getSalary()
{
	return salary;
}




@Override
public String toString()
{
	return "Name="+name+"\nDate Of Birth="+new SimpleDateFormat("dd-mmm-yyyy").format(dateOfBirth);
}
}