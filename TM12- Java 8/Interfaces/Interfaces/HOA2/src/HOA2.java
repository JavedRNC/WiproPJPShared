interface Test
{
    public int MyFunction(int a, int b, int c);
}


public class HOA2 {
    
    public static void main(String[] args) {
        Test t1 = (int a, int b, int c) -> a+b+c;
        Test t2 = (int a, int b, int c) -> a*b*c;
        
        int t1Result = t1.MyFunction(2, 3, 5);
        int t2Result = t2.MyFunction(2, 3, 5);
        
        System.out.println(t1Result);
        System.out.println(t2Result);
    }
    
}
