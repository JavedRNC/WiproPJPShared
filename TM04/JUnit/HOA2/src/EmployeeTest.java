import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testFindName() {
		ArrayList emp = new ArrayList();
		emp.add("Javed");
		emp.add("Shahid");
		emp.add("Aatifa");
		Employee e = new Employee();
		
		
		assertSame("FOUND",e.findName(emp, "Aatifa"));
		assertSame("NOT FOUND",e.findName(emp, "Aashiq"));
		
	}
	
	

}
