package hoa3;

class PrimeClass
{

    PrimeClass(int n) {
        int flag = 0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Not Prime");
        else
            System.out.println("Prime");
    }
    
}

interface primeInterface
{
    void isPrimeInterface(int n);
}
public class HOA3 {

    
    public static void main(String[] args) {
       
       primeInterface pInterface = PrimeClass::new;
       pInterface.isPrimeInterface(4971);
    }
    
}
