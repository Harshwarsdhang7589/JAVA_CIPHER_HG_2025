// package LECTURE03;
 
// ANOTHER WAY TO DEFINE A THREAD:[ NOT A STANDARD APPROACH: ]  


//        DURGA'S :PART 1 APPROACH OF DEFINING A THREAD
public class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child thread");

    }
    /* public void start()

    {
        System.out.println("Child start Thread");
    } */
}

class Test
{
    public static void main(String[] args) {
        MyThread r=new MyThread();
        Thread t=new Thread(r);

        t.start();
        System.out.println("Main Thread:");
    }
}
/*
    OUTPUT: OBSERVATION 01:
    D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>javac MyThread.java

D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>java Test
Main Thread:
Child thread

D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>
     */

