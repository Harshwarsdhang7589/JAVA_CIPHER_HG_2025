/*  
        DOUBT 01:
        " MyThread2 r=new MyThread2(); 
        Thread t=new Thread(r);
                               "
                               When you write Thread t = new Thread(r);, you are using a specific constructor of the Thread class. Here is exactly what is happening behind the scenes:

1. The "Job" vs. The "Worker"
To understand this, you have to separate the work from the person doing the work.
    r (The Runnable): This is the Job. It contains the run() method (the instructions), but it has no power to create a new thread
 stack by itself.
    t (The Thread object): This is the Worker. The Thread class has the "magic" (the start() method) to talk to the 
    Operating System and create a new stack.
By passing r into the constructor new Thread(r), 
 you are assigning the job to the worker.
 You are telling the Thread: "When I call start(), don't look for a run() method inside yourself; 
 instead, go run the run() method inside this r object I gave you." 
 
 **************************************************************************************************************************************
                                                    DOUBT 02:
 "The real use of : Super.start();"

 Here is exactly how the "Magic" works when you use super.start():

1. The "Magic" is only in the Parent Class
The "magic" (the ability to create a new thread) lives only inside the original Thread class.
When you write public void start() in your child class, you are hiding that magic.
The JVM no longer sees the built-in start(); it only sees yours.
By writing super.start(), you are manually reaching out and grabbing that hidden magic from the parent class and pulling it into your code.

2. Who is calling what?
It is not the "child thread" calling super.start(). It is the Main Thread that does all the work of launching.
                 The sequence looks like this:

   Main Thread calls t.start().
   Main Thread enters your child class and executes your custom start() method.
   Main Thread hits the line super.start().
   Main Thread goes into the Parent (Thread) class and triggers the "Magic Engine."

The Magic Engine creates the Child Thread.
Child Thread starts running and automatically looks for the run() method.

3. Does it run "twice"?
     No, it runs once, but in two parts:

Part 1 (The Setup): Your custom code in the start() method (running on Main Thread).

Part 2 (The Execution): The code in the run() method (running on the New Child Thread).

If you didn't have super.start(), Part 2 would never happen. The "Magic" only happens once, right at the moment super.start() is executed.
 
 
*******************************************************************************************************
                                    DOUBT 03:            for link gaikwadh107@gmail.com : " https://gemini.google.com/share/9d758c20380b"
                  " "                  

                  You are very close, but let’s refine that one specific word: "skips."

The JVM doesn't randomly decide to skip things; it follows a strict "search" rule. Once it finds a method that matches the name you called, it stops searching and runs it.

Here is the final confirmation of your understanding:

1. In Approach 1 (No start() in your class)
You are correct that the JVM uses the built-in version.
The Search: JVM looks at MyThread2. It sees no start() method.
The Move: It moves up to the parent class (Thread). It finds the built-in start().
The Execution: It runs that built-in code. This code is "silent" (no SOP), but it creates a new thread and then calls your run() method.

Result: You see "main thread" and "child thread."

2. In Approach 2 (You wrote a start() in your class)
You are correct that by writing your own start(), you "took over" the job.
The Search: JVM looks at MyThread. It finds your start() method immediately.
The Execution: It runs your code only.
The "Skip": Because it found your version, it skips/ignores the built-in Thread.start() logic.
The Consequence: Since the built-in logic was the only thing capable of creating a new thread stack, no new thread is created. Your code runs like a normal, boring method on the main thread.

Visualization of the "Search"
Summary of your understanding: You are right that the JVM "chooses" which method to run based on whether you provided one or not.
If you provide it: JVM runs yours (and ignores the built-in "magic").
If you don't provide it: JVM uses the built-in "magic" (which is silent but starts the thread).
One small correction to your wording:
You mentioned: "it overrides/ or skipps the other start() method present and leaving the start() other method and everything other gets called!!!"

To be technically precise:
If you don't write start(), there is no "other" method to skip—there is only the built-in one.
If you do write start(), the JVM skips the built-in one.
You have definitely grasped the logic now! The reason you were confused was simply because the built-in start() method does its work "behind the scenes" without printing any text to the console.
 
 
 */