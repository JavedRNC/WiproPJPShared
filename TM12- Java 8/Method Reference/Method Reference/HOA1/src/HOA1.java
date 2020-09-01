class FactorialClass
{
   public int factorial(int n)
    {
        int result=1;
        for(int i=1;i<=n;i++)
           result = result*i;
        return result;
    }
}

interface factorialInterface
{
    public int factorialReference(int a);
}

public class HOA1 {

    public static void main(String[] args) {
        
        FactorialClass f = new FactorialClass();
        factorialInterface fInterface = f::factorial;
        
        System.out.println(fInterface.factorialReference(5));
       
    }
    
}
