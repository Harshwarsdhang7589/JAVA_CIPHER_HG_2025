package Question;
// It is creating a name.priority and loops.


    public class NewThread implements Runnable {
    Thread t; /// Thread refrence variables.This will holds the thread objects that will execute the run() method 

    NewThread() 
    // Thread Class Constructor and Accepts parametrs.Constructor here are used to intialise 
     {
        //Creating Thread object and this.Refres to the current object which implements runnable.
        t = new Thread(this, "Demo Thread");// Parametrs given and thread object are created and thread include in the java .lang library includes the "Thread
        // " t = new Thread(this, "Demo Thread");" To create a thread
        System.out.println("Child thread: " + t);
        t.start();// The Start() it searcches the run() Method.Statrts the exceution of the Prayer and it internally calls the run() method in  a Separate Thread.
    //JVM decides when run will execute for specific thread 
    }


    // Run() this is manadatory and when running the Runnable intereference.This method enters the code that will be executed by childThread.
    public void run()
    // overriding is performed through run()
    {
        // Sleep(): method Exceptionally Manditoartes to every time to use inside the "Try---Catch Exception Handling"
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);// Pause child thread exceution for (500) milliseconds.Helps demonstrates milliseconds executiion. 
            }
        } catch (InterruptedException e)// inisde the "e" exception of error will be handled inn inside "e".Handles interruption:If thread is interrrupted during "Sleeps()"
         {
            // Executes when child thread finished it execution.
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

class ThreadDemo {
    public static void main(String args[]) { // main thread.JVM always creates an Main Thread
        new NewThread(); // Object creatinon in newThread() [no refrence variable created and no stored in any object]
        // This automatically creates and starts the child Thread. 

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);// each code of a loop runnse every 1k milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
// Thread Exceution is in hand of the JVM and designing accoring is in developer in-hand.

    

