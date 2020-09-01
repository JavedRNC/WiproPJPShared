import com.wipro.automobile.ship.*;

class HOA2 extends Compartment
{
   public static void main(String[] args)
   {
   Compartment Ship[] = new Compartment[10];
   for(int i=0;i<10;i++)
   {
	   Ship[i] = new Compartment();
   }
   
   for(int i=0;i<10;i++)
   {
      Ship[i].height = 10.0f;
      Ship[i].width = 45.9f;
      Ship[i].breadth = 12.45f;
   
   }
   
   for(int i=0;i<10;i++)
   {  System.out.println("Ship["+i+"] details(height,width & breadth):");
      System.out.println(Ship[i].height); 
      System.out.println(Ship[i].width);
      System.out.println(Ship[i].breadth);
	  System.out.println();
   }
   }
}