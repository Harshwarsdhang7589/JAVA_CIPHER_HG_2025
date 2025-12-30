package MainThreadDemo;
// controlling the main thread
 public class ClassCode {
    public static void main(String[] args)
    {
        Thread t= Thread.currentThread();// int a  and current thread is static method() and Current Thread refrence (address) is set at "t" of thread
        System.out.println("Current Thread=" +t);// Output: Current Thread=Thread[#1,main,5,main] Here, 1-> Name,main->character,5->Priority

        t.setName("Demo Thread");
        System.out.println("After changing name" +t);// After changing nameThread[#1,Demo Thread,5,main]

        try
        {
            for(int i=0;i<=5;i++)
            {
                System.out.println("Output: " +i);
                Thread.sleep(1000);// Relay for 1seconds and it is calls under static class of "thread(t)"
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");


        }


        



        
    }
    
}
