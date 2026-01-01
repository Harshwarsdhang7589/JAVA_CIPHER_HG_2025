/*
     	 
	- Create class "MathOperations1" with following member : 
        - Static counter: to track the no. of time a static method is called.
        - static int add(int a, int b):  sums two numbers and increments counter
		- int multiply(int a, int b): Returns the product of two numbers
		
	- Create another class "MathOperations2"	
	    - call add() twice and display counter 
		- Use an instance to call multiply() after the call add()
		- Display updated counter. 
		
*/
public class MathOperations1 
{
    /**
     * Static counter to track the number of times the static add method is called.
     * It belongs to the class, not to any specific instance.
     */
    public static int counter = 0;

    /**
     * A static method that adds two integers and increments the static counter.
     */
    public static int add(int a, int b) {
        counter += 1; // Increment the counter each time this method is called
        return a + b;
    }

    /**
     * An instance method that multiplies two integers.
     * It does not affect the static counter.
     */
    public int multiply(int a, int b) {
        return a * b;
    }
}
