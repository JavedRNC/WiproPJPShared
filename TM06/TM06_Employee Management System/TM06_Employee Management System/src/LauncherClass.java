import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class LauncherClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        FileOutputStream fileOutputStream = new FileOutputStream("datafile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        int choice;
        do {
            System.out.println("Main Menu");
            System.out.println("1.Add an Employee");
            System.out.println("2.Display All");
            System.out.println("3.Exit");
            choice = sc.nextInt();
            switch(choice)
            {
            case 1:
                System.out.print("Enter Employee ID:");
                employee.setId(sc.nextInt());
                sc.nextLine();
                System.out.print("Enter Employee Name:");
                employee.setName(sc.nextLine());
                System.out.print("Enter Employee Age:");
                employee.setAge(sc.nextInt());
                System.out.print("Enter Employee Salary:");
                employee.setSalary(sc.nextDouble());        
                objectOutputStream.writeObject(employee);
                objectOutputStream.flush();

                break;
            case 2:
                System.out.println("----Report----");
                FileInputStream fileInputStream = new FileInputStream("datafile");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                objectInputStream.readAllBytes();
                while(fileInputStream.available()!=0)
                {
                employee = (Employee)objectInputStream.readObject();
                System.out.println(employee);
                }
                System.out.println("----End of Report---");
                objectInputStream.close();
                break;
            case 3:
                break;


            }


        } while (choice!=3);
        objectOutputStream.flush();
        objectOutputStream.close();



    }

}