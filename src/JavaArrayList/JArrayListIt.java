package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class JArrayListIt {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        // Get an iterator for the ArrayList
        Iterator<String> it = cars.iterator();

        // Iterate through the list using the iterator
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

