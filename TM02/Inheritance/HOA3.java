class Person
{
	String name;
	String DOB;
	
	void setName(String name)
	{
		this.name = name;
	}
	
	void setDOB(String DOB)
	{
		this.DOB = DOB;
	}
	
	String getName()
	{
		return name;
	}
	
	String DOB()
	{
		return DOB;
	}
}

class Teacher extends Person
{
	double salary;
	String subject;

void setSalary(double salary)
{
	this.salary = salary;
}

void setSubject(String subject)
{
	this.subject = subject;
}

double getSalary()
{
	return salary;
}

String getSubject()
{
	return subject;
}
}

class Student extends Person
{
	int studentID;
	
	void setStudentID(int ID)
	{
		this.studentID = ID;
	}
	
	int getStudentID()
	{
		return studentID;
	}
}

class CollegeStudent extends Student
{
	String collegeName;
	String year;
	
	void setCollegeName(String colName)
	{
		this.collegeName = colName;
	}
	
	void setYear(String year)
	{
		this.year = year;
	}
	
	String getCollegeName()
	{
		return collegeName;
	}
	
	String getYear()
	{
		return year;
	}
}

class HOA3
{
   public static void main(String[] args)
   {
	Person person = new Person();
	person.setName("Javed");
	System.out.println(person.getName());
   
   Teacher teacher = new Teacher();
   teacher.setName("Shahid");
   teacher.setSalary(30000.99);
   teacher.setSubject("Environment Studies");
   System.out.println(teacher.getName());
   System.out.println(teacher.getSalary());
   System.out.println(teacher.getSubject());
   
   Student student = new Student();
   student.setName("Azhar");
   student.setStudentID(1773613017);
   System.out.println(student.getName());
   
   CollegeStudent cs = new CollegeStudent();
   cs.setName("Shahnawaz");
   cs.setCollegeName("City Public School");
   cs.setYear("Fourth");
   
   System.out.println(cs.getName());
   System.out.println(cs.getCollegeName());
   System.out.println(cs.getYear());
   
	}
}
