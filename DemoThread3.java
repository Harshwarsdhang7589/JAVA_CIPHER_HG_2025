public class DemoThread3 extends Thread  
{
    // IT IS NEVER RECOMMENDED TO OVERRIDE THE START METHOD() BECAUSe:Then no use of Concept of multithreading.

    public void start()
    {
        super.start();
        System.out.println(" Ready to Start Method:");
    }
    public void run()
    {
        System.out.println("Run mathods");
    }
  
}

 class Test
{
    public static void main(String[] args)
    {
        DemoThread3 k1=new  DemoThread3();
        
        k1.start();// ONLY THE START():WILL BE GET EXECUTED only but in normal way.
        // run method will not get executed
       
            System.out.println(" MAIN METHOD EXECUTED:");
        
    }
}
  

// output:
/*    OUTPUT 01:
     D:\JAVA NON BOOK\MUTLITHREADING>java Test
 Ready to Start Method:
Run mathods
 MAIN METHOD EXECUTED:

        OUTPUT 02:

 
        D:\JAVA NON BOOK\MUTLITHREADING>java Test
        Ready to Start Method:
        MAIN METHOD EXECUTED:
        Run mathods
         */
    

