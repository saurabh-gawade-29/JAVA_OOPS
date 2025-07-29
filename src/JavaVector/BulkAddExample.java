package JavaVector;
import java.util.Vector;
import java.util.Arrays;

public class BulkAddExample {
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Alice");
        names.addAll(Arrays.asList("Bob", "Charlie", "Dana"));

        System.out.println("All names: " + names);

        names.remove("Charlie"); // Removes "Charlie" by value
        System.out.println("After removal: " + names);
    }
}
