package JavaVector;

import java.util.Vector;

public class SearchExample {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Green");

        int firstIndex = colors.indexOf("Green"); // 1
        int lastIndex = colors.lastIndexOf("Green"); // 3

        System.out.println("First Green at: " + firstIndex);
        System.out.println("Last Green at: " + lastIndex);
    }
}

