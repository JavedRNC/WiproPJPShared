
import java.lang.Math;

abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	public String notice()
	{
		return "-FirstClass-";
	}
}

class Ladies extends Compartment
{
	public String notice()
	{
		return "-Ladies-";
	}
}

class General extends Compartment
{
	public String notice()
	{
		return "-General-";
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		return "-Luggage-";
	}
}

class TestCompartment
{
	public static void main(String[] args)
	{
		Compartment[] compartment = new Compartment[10];
		for(int i=0;i<10;i++)
		{
			int x = (int)((Math.random()*((4-1)+1))+1);
			switch(x)
			{
				case 1:
				{
					compartment[i] = new FirstClass();
					System.out.print(compartment[i].notice());
					break;
				}
				case 2:
				{
					compartment[i] = new Ladies();
					System.out.print(compartment[i].notice());
					break;
				}
				case 3:
				{
					compartment[i] = new General();
					System.out.print(compartment[i].notice());
					break;
				}
				case 4:
				{
					compartment[i] = new Luggage();
					System.out.print(compartment[i].notice());
					break;
				}
			}
		}
	}
}