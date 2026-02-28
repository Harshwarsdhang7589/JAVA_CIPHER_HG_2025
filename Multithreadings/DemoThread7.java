public class DemoThread7  extends Thread
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
        DemoThread7 k1=new  DemoThread7();
        
        k1.start();// ONLY THE START():WILL BE GET EXECUTED only but in normal way.
        // run method will not get executed
       
            System.out.println(" MAIN METHOD EXECUTED:");

            k1.start();
        
    }
}

/*     OUTPUT:

     D:\JAVA NON BOOK\MUTLITHREADING>java Test
            Ready to Start Method:
            MAIN METHOD EXECUTED:
            Run mathods
                        Exception in thread "main" java.lang.IllegalThreadStateException
                                at java.base/java.lang.Thread.start(Thread.java:1512)
                                at DemoThread7.start(DemoThread7.java:8)
                                at Test.main(DemoThread7.java:29)
    */
                        
    

