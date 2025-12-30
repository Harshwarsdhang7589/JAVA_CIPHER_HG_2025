package Question;

    // II way:2nd way of Extensive Thread  :
    public class NewThread1 extends Thread // This works of Inheritance 
    {
        // no use intiilaisation of "Thread t"

    NewThread1() {
        super("Demo Thread");
        System.out.println("Child thread: " + this);// "this" through this refrence from "newthread.java" file :The inheristance done by. it calls to string() to display
        // What happens internally:JVM asks OPERATING SYSTEM to create a new Thread .Thread goes to Runnable State .JVM Deceide when the Run executes.
        // From here the Executiion is not in our  hand.
        start();// 
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class ExtendThread {
    public static void main(String args[]) {
        new NewThread1();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}

    

