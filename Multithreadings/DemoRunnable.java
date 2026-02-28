package LECTURE_03;

public class DemoRunnable implements Runnable
 {
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println("CHILD THREAD ADRE:" +i);
        }

    }
    
}
class Test
{
    public static void main(String[] args)
    {
        DemoRunnable r=new DemoRunnable();

        Thread k = new Thread(r);
        k.start();

        for(int i=0;i<3;i++)
        {
            System.out.println("Main Thread::"+i);
        }
    }
}
