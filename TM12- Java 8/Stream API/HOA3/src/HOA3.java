
import java.util.ArrayList;

class Student
{
    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
    
    
    
}

public class HOA3 {

    public static void main(String[] args) {
       ArrayList<Student> aList = new ArrayList<Student>();
       aList.add(new Student(1,"Javed",57));
       aList.add(new Student(2,"Shahid",50));
       aList.add(new Student(3,"Ramesh",45));
       aList.add(new Student(4, "Keshav", 43));
       aList.add(new Student(5,"Suresh",33));
       
       int passCount = (int) aList.stream().filter(x->x.mark>=50).count();
        System.out.println(passCount);
       
    }
    
}
