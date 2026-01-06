package MULTITHREADING;
public class DemoThread extends Thread 
{
    public void run() // Executed by a child thread which is a 2nd thread 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Main Thread :1Thread working runs:."+i);// this is a PURE JOB OF THREAD CORE WORKING OF A THREAD
        }
    }



public static void main(String[] args)
{
    DemoThread k=new DemoThread();// main Thread :1Thread present till now

    k.start();// Second thread created by main thread and THREAD STARTS()
    /*
         DOUBT:If in Case of K.start() --> k.run() is executed then whta will happen?
           
         1] if k.run(): will be written and executed in place of k.start() then k.run() will get ruuned as a NORMAL FUNCTION() and the thread WON'T be runned
           So, while using a thread we need to use in main function "k.start()" to SUCCESSFULLY RUN A THREAD.
           
        2] IF I use k.RUN()--> THEN,
               In this case as there will be only one thread in a main function to get running and if we use "K.START() then only 2 thread will be running and no all pressue will be applied on one thread.
               
               */

    for(int i=0;i<3;i++)
    {
        System.out.println("Second Thread: Start of thread:...."+i);
    }


}

}
