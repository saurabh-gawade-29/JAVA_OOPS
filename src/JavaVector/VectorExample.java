package JavaVector;
import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector with initial capacity 3 and capacity increment 2
        Vector<Integer> v = new Vector<>(3, 2);
        // Add elements to the vector
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v);
        // Insert element 0 at index 1
        v.insertElementAt(0, 1);

        // Remove element at index 2 (which is 2)
//        v.removeElementAt(2);

        // Display elements using for-each loop
        System.out.println("Elements in Vector:");
        for (int i : v) {
            System.out.println(i);
        }

        // Additional demonstration with Enumeration
        Enumeration<Integer> elements = v.elements();
        System.out.print("Elements using Enumeration: ");
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement() + " ");
        }
        System.out.println();

        // Show size and capacity
        System.out.println("Vector size: " + v.size());
        System.out.println("Vector capacity: " + v.capacity());
    }
}
