public class Error
{
    public static void main(String[] args)
    {
        try
        {
            //airthematic exception
            int result=100/0;

        }
        catch(ArithmeticException E)
        {
            System.out.println(E.toString());


        }

        System.out.println("Forward !!! Hello java i am back..");


    }
}