package MainThreadDemo;
 
public class ThreadDemo1 implements Runnable  // runnable interface
{
    Thread t;
    ThreadDemo1(Thread t)//constructor
    {
       this. t= new Thread(this,"DemoThread");
        System.out.println(t);
        t.start();// Child Thread Start()

    }

    public void run()
   {
    try
    {
        for(int i=5;i>0;i--)
        {
            System.out.println("Output: " +i);
                Thread.sleep(1000);// Relay for 1seconds
        }
    }
    catch(InterruptedException e)
        {
            System.out.println("Child interruption");

        }
   }
   public class ThreadDemoMain
   {
    public static void main(String[] args)
{
    new ThreadDemo1(); 
    // Create child thread  bject
    try
    {
        for(int n=5;n>0;n--)
        {
            System.out.println("output" +i);
            Thread.sleep(1000);

        }
    }
    catch(InterruptedException e)
    {
        System.out.println("Child Interruption");

    }
    System.out.println("Main Thread Exiting");
 }
   } 

    
}
