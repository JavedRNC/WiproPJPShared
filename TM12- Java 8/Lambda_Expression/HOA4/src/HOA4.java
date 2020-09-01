interface wordCount
{
    abstract int count(String str);
}

class myClassWithLambda
{

        wordCount wc = (str2)->
        {
            String words[] = str2.split(" ");
            return words.length;           
        };
    
    
}
public class HOA4 {
    public static void main(String[] args) {
        
        myClassWithLambda obj = new myClassWithLambda();
        int count = obj.wc.count("I want to go Dubai for job purpose");
        System.out.println(count);
       
    }
    
}
