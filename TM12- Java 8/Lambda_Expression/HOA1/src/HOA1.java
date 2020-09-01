
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HOA1 {

    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(29,32,37,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,20,22,23,24,25);
       ArrayList<Integer> al = new ArrayList<Integer>();
       al.addAll(list);
       al.forEach(n->{ 
           boolean isPrime = true;
           for(int i=2;i<=n/2;i++)
           {
               if(n%i==0)
               {     
                   isPrime = false;
                   break;
               }
               
           }
           
           if(isPrime)
           {
               System.out.println(n);
           }
           });
    }
    
}
