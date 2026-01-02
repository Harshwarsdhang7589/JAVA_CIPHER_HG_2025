import Q6.Throw2;

public class Throws1 
{
    static void CheckAge(int age) throws ArithmeticException // METHOD OVERRIDING WITH PARAMETERS 
    {
        if(age<18)
        {
            throw new ArithmeticException("ACCESS DENIED:Age<18");
        }
        else
        {
            System.out.println("ACCESS GRANTED:");
        }

    }

    
public static void main(String[] args)
 {
    Throws1 s1=new Throws1();
    try
    {
        s1.CheckAge(15); // directly checkAge(16);
    }
    catch(Exception e)
    {
        // System.out.println("ACCESS NOT GRANTED :404 ERROR");
    }
    
    
        System.out.println("404 EXCEPTION ERROR...");


 }
    
    
}
