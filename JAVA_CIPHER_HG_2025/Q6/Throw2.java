package Q6;

public class Throw2 {
     static void CheckAge(int age) // METHOD OVERRIDING WITH PARAMETERS 
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
    Throw2 s1=new Throw2();
    try
    {
        s1.CheckAge(15); // directly checkAge(16);
    }
    catch(Exception e)
    {
        System.out.println("ACCESS NOT GRANTED :404 ERROR");
    }
    
    
        System.out.println("404 EXCEPTION ERROR...");


 }
    
}
