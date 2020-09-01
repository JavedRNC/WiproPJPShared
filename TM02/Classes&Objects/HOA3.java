class Patient
{
	String patientName;
	double height;
	double weight;
	
	double computeBMI(double w,double h)
	{	weight = w;
		height = h;
		return weight/(height*height);
	}
}

public class HOA3
{	
	public static void main(String[] args)
	{
		Patient p = new Patient();
		System.out.println(p.computeBMI(64,4));
	}
}