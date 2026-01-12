import java.util.*;

public class CourseSetComparison {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Java Fundamentals", "Python for Beginners", "Data Structures", "Java Fundamentals", "Web Development");

        // hashSet : No order, allows null
        Set<String> hashSet = new HashSet<>(courses);

        // LinkedHashSet : maintains insertion order, allows null
        Set<String> linkedHashSet = new LinkedHashSet<>(courses);

        // treeSet : Stored order, does NOT allow null
        Set<String> treeSet = new TreeSet<>();
        for (String course : courses) {
            try {
                treeSet.add(course);
            } catch (NullPointerException e) {
                System.out.println("TreeSet cannot store null values!");
            }
        }

        System.out.println(hashSet);
        System.out.println("\n=== LinkedHashSet (Insertion Order) ===");
        System.out.println(linkedHashSet);
        System.out.println("\n=== TreeSet (Stored Order, No null) ===");
        System.out.println(treeSet);

        // Demonstrate some common operations
        System.out.println("\n---- Common Operations ----");
        System.out.println("Contains 'Data Structures' in HashSet? " + hashSet.contains("Data Structures"));
        System.out.println("Contains 'Data Structures' in LinkedHashSet? " + linkedHashSet.contains("Data Structures"));
        System.out.println("Contains 'Data Structures' in TreeSet? " + treeSet.contains("Data Structures"));

        System.out.println("\nRemoving 'Web Development' from all sets....");
        hashSet.remove("Web Development");
        linkedHashSet.remove("Web Development");
        treeSet.remove("Web Development");

        System.out.println("\nAfter removal: ");
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        // Display sizes 
        System.out.println("\nSizes: ");
        System.out.println("HashSet sizes: " + hashSet.size());
        System.out.println("LinkedHashSet sizes: " + linkedHashSet.size());
        System.out.println("TreeSet sizes: " + treeSet.size());

        // Clear all sets
        hashSet.clear();
        linkedHashSet.clear();
        treeSet.clear();

        System.out.println("\nAfter clear():");
        System.out.println("HashSet empty? " + hashSet.isEmpty());
        System.out.println("LinkedHashSet empty? " + linkedHashSet.isEmpty());
        System.out.println("TreeSet empty? " + treeSet.isEmpty());

        // e.g., System.out.println("HashSet size: " + hashSet.size());
    }
}
