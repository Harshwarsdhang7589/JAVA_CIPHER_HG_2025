public class Eception {
    public static void main(String[] args) {
        //Number Format Exceptions:
        try
        {
            String s=null;
            System.out.println(s.length());

        }
        catch(NullPointerException e)
        {
            System.out.println(e.toString());
        }
    System.out.println("Hello Java");
}
    
    
}
