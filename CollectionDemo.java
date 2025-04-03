import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
       
        Vector<String> names = new Vector<>();     // Vector Example
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        System.out.println("Original Vector: " + names);
        names.remove("Bob");
        System.out.println("After removing 'Bob': " + names);
        System.out.println("Searching for 'Alice': " + (names.contains("Alice") ? "Found" : "Not Found"));

        Collections.sort(names);                                // Sorting Vector
        System.out.println("Sorted Vector: " + names);

        ArrayList<Integer> numbers = new ArrayList<>();          // ArrayList Example

        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);

        System.out.println("\nOriginal ArrayList: " + numbers);
        numbers.remove(Integer.valueOf(3));
        System.out.println("After removing 3: " + numbers);
        System.out.println("Searching for 9: " + (numbers.contains(9) ? "Found" : "Not Found"));

        System.out.println("Iterating through ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // HashMap Example
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 78);
        studentMarks.put("Charlie", 92);

        System.out.println("\nStudent Marks: " + studentMarks);
        studentMarks.remove("Bob");
        System.out.println("After removing 'Bob': " + studentMarks);
        System.out.println("Marks for 'Alice': " + studentMarks.getOrDefault("Alice", -1));

        System.out.println("Iterating through HashMap:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
