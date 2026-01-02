package Q5;

public class Final1 {
    public static void main(String[] args)
    {
        try
        {
            
        // To Understand Concept of:"Array index out of Bound Exception"
        int [] arr1 = new int[5];

        arr1[8]=20;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {

        System.out.println("If Error Caused.Catch Block will Executed=" +e.toString());

        }
        finally
        {
            System.out.println("Hello Java");
        }
    
}
}
