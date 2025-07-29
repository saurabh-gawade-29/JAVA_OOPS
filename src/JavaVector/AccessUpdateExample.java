package JavaVector;
import java.util.Vector;

public class AccessUpdateExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);

        int val = numbers.get(1); // Fetch element at index 1 (22)
        System.out.println("Element at index 1: " + val);

        numbers.set(1, 99); // Update value at index 1
        System.out.println("Updated Vector: " + numbers);
    }
}

