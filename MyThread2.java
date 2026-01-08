// package LECTURE 03;

// ANOTHER WAY TO DEFINE A THREAD:[ NOT A STANDARD APPROACH: ]  


//        HARSHWARDHAN'S :PART 1 APPROACH OF DEFINING A THREAD

public class MyThread2 extends Thread 
{
    
    public void run()
    {
        System.out.println("Child thread");

    }
     public void ways()

    {
        System.out.println("Child start Thread");
    } 
}

class Test
{
    public static void main(String[] args) {

        MyThread2 r=new MyThread2();
        
        Thread t=new Thread(r);

        t.start();
        System.out.println("Main Thread:");
    }
}

/*   OUTPUT: OBSERVED ARE-->

    D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>javac MyThread2.java

    D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>java Test
    Main Thread:
    Child thread

D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>
       */
    
