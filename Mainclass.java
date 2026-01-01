package static;

public class Mainclass {
    public static void main(String[] args) {

        System.out.println("Calling static method add(10, 20)...");
        MathOperations1.add(10, 20);

        System.out.println("Calling static method add(5, 7)...");
        MathOperations1.add(5, 7);

        // Display the counter after calling the static method twice
        System.out.println("--------------------------------------------------");
        System.out.println("Value of static counter after two add() calls: " + MathOperations1.counter);
        System.out.println("--------------------------------------------------");

        // Create an instance of MathOperations1 to call the non-static method
        MathOperations1 s1 = new MathOperations1();

        // Call the non-static multiply() method using the instance
        int product = s1.multiply(8, 9);
        System.out.println("\nCalling instance method multiply(8, 9)... Result: " + product);

        // Display the counter again. Its value will not have changed because
        // multiply() is an instance method and does not modify the static counter.
        System.out.println("--------------------------------------------------");
        System.out.println("Final value of static counter after multiply() call: " + MathOperations1.counter);
        System.out.println("--------------------------------------------------");
    }
}
