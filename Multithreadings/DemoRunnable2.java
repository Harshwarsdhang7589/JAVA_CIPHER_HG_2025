public class DemoRunnable2 implements Runnable 
// it can also be written as: public class DemoRunnable2 extends (any class) Thread implements Runnable
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
            // No thread is created and thread class runnable method will be executed just like a normal method() call 
            t2.start();// no symbol compile error & New thread will be created  which is responsible for execution for myrunnable method()

            t2.run();// a new thread won't be created and demorunnable  run() method will be executed just like a normal method() call.


            r.start();// we will get compile time error.My runnable class don't have stopped capacity.
            r.run();//no new thread will be created and demorunnable method() will be SUCCESSFULLY EXECUTED  like a normal method call


        }
    }
}
