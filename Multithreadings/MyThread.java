// package THREAD PRIOIRITY;

public class MyThread  extends Thread
{    
    
}
class Test
{
    public static void main(String[] args) {
        {
            System.out.println(Thread.currentThread().getPriority());// normal priority :5
            Thread.currentThread().setPriority(7);

            MyThread t1 = new MyThread();
            System.out.println(t.getPriority());//7 output 5<7
        }
    }
}
