public class DemoRunnable2 implements Runnable
{
    public void run()
    {
        for(int i =0;i<4;i++)
        {
            System.out.println("Child Thread");
        }
    }
    
}
class Test
{
    public static void main(String[] args) {
        {
            DemoRunnable2 r=new DemoRunnable2();

            Thread t1=new Thread();// without argument
        
            Thread t2=new Thread(r);//// with argument

            t1.start();
            t1.run();// IN BOTH COMPILE TIME ERROR

            t2.start();// no symbol compile error
            t2.run();

            r.start();
            r.run();


        }
    }
}
