import java.util.*;
import java.io.*;

public class HOA2 {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter the input file name");
		Scanner sc = new Scanner(System.in);
		File file1 = new File(sc.nextLine());
		FileReader fin = new FileReader(file1);
		System.out.println("Enter the output file name");
		File file2 = new File(sc.nextLine());
		FileWriter fout = new FileWriter(file2);
		int c;
		while((c=fin.read())!=-1)
		{
			fout.write(c);
		}
		System.out.println("File is copied");
		
		fin.close();
		fout.close();

	}

}
