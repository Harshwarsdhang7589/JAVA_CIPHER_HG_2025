// package LECTURE 03;

public class NameThread1 extends Thread {

    
}
class Test
{
    public static void main(String[] args)
    {
        // I wanted to get the default Name of the Thrread as "Main" 
         System.out.println(Thread.currentThread().getName()); // system output as thread name will be " main"

        NameThread1 t1 = new NameThread1();// child thread object is created
        System.out.println(t1.getName());// "default-0" this id the thread object name

        // if i wanted to change the name of the thread as:
        Thread.currentThread().setName("Harsh");
        System.out.println(Thread.currentThread().getName());

        // getName: it ask what is your name??or displays the name.
        // setName():it insert or updates the name.


    }
}

/*      OUTPUT AS:
     D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>javac NameThread1.java

            D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>java Test
            main
            Thread-0
            Harsh

D:\JAVA NON BOOK\MUTLITHREADING\LECTURE 03>
 */