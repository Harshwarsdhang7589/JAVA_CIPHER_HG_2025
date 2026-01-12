import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlistdemo {
    public static void main(String[] args) {
        LinkedList < String > tasks = new LinkedList<>();

        tasks.add("Code Review");
        tasks.add("Prepare Report");
        tasks.add("Client Meeting");
        System.out.println("Initial tasks : " + tasks);

        tasks.addFirst("Login to system");
        tasks.addLast("Submit Daily Status");

        System.out.println("after adding at first and last : " + tasks);

        System.out.println("First Task : " + tasks.getFirst());
        System.out.println("Last Task : " + tasks.getLast());

        tasks.set(2, "Design Module");
        System.out.println("after modifications : " + tasks);

        System.out.println("Contains 'Client Meeting' ? " + tasks.contains("Client Meeting"));
        System.out.println("Contains 'Design Module ' ? " + tasks.contains("Design Module"));

        // Removing elements

        tasks.remove("Client Meeting"); // remove bu value
        tasks.remove(0); // remove by index

        System.out.println("After removals : " + tasks);

        // Remove First and last

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("After removing first and last : " + tasks);

        //Adding duplicates and null

        tasks.add("Design Module");
        tasks.add("Code Review");
        tasks.add(null);

        System.out.println("After adding duplicates and null : " + tasks);

        // Displaying size and emptiness
        System.out.println("list Size : " + tasks.size());
        System.out.println("Is List Empty ? : " + tasks.isEmpty());

        //Retrieving index - based info
        System.out.println("Index of 'Design Module ' : " + tasks.indexOf("Design Module"));
        System.out.println("Last Index of 'Design Module' : " + tasks.lastIndexOf("Design Module"));

        // Peeking and polling (queue-style operations )
        System.out.println("Peek (first element) : " + tasks.peek());
        System.out.println("Poll (remove first) : " + tasks.poll());
        System.out.println("After poll : " + tasks);

        // Traversing elements
        System.out.println("\nTraversal using for each loop : ");
        for (String t : tasks)
            System.out.println(t);

        System.out.println("\nTraversal using Iterator : ");
        Iterator <String> itr = tasks.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("\nTraversal using ListIterator (reverse) ; ");
        ListIterator<String> litr = tasks.listIterator(tasks.size());

        while (litr.hasPrevious())
            System.out.println(litr.previous());

        //clearing all elements

        tasks.clear();
        System.out.println("\nAfter Clear() : " + tasks);
        System.out.println("Is list empty now ? : " + tasks.isEmpty());
        
    }
}