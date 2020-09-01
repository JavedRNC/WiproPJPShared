
package hoa2;

class DigitCountClass
{
    
    static int digitCount(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n= n/10;
            count++;
        }
        
        return count;
    }
}

interface functionalInterface
{
    int countOfDigits(int n);
}
public class HOA2 {

    
    public static void main(String[] args) {
        
        functionalInterface fInterface = DigitCountClass::digitCount;
        System.out.println(fInterface.countOfDigits(74326));
    }
    
}
