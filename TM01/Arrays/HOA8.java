public class HOA8 {

 public static void main(String[] args) {
  int[] arr = {1,6,4,7,9};
  int sum = 0;
  int j = 0;
  boolean is7found = false;
  for (int i = 0; i < arr.length; i++) 
    {
     if (arr[i] == 6)
      {
       for (j = i; j < arr.length; j++) 
	{
         if (arr[j] == 7)
	  {
           i = j;
           is7found = true;
           break;
           }
         }

      }
   if (!is7found)
   {
    sum = sum + arr[i];
   }
   is7found = false;

  }

  System.out.println(sum);

 }

}