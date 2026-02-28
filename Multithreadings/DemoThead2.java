// IT IS NEVER RECOMMENDED TO OVERRIDE THE START METHOD() BECAUSe:Then no use of Concept of multithreading.

public class DemoThead2  extends Thread
{
    public void start()
    {
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
        DemoThead2 k1=new DemoThead2();
        k1.start();// ONLY THE START():WILL BE GET EXECUTED only but in normal way.
        // run method will not get executed
        for(int i=0;i<1;i++)
        {
            System.out.println(" MAIN METHOD EXECUTED:" +i);
        }
    }
}
