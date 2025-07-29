package JavaVector;

import java.util.Vector;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Vector<Double> v = new Vector<>();
        v.add(2.5);
        v.add(3.7);
        v.add(4.9);

        Iterator<Double> it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

