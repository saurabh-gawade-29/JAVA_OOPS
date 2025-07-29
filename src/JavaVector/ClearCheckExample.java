package JavaVector;

import java.util.Vector;

public class ClearCheckExample {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("A");
        list.add("B");
        list.clear();

        System.out.println("Is vector empty? " + list.isEmpty()); // true
    }
}