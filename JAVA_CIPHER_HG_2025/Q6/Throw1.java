package Q6;
// EXAMPLE: If age below 18 then to throw exception of error message is ("Access denied") and or else age above 18 erroro exception message ("Aceess GRANTED")

public class Throw1 
{
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

    
public static void main(String[] args) {
    Throw1 s1=new Throw1();
    s1.CheckAge(15); // directly checkAge(16);


}}

