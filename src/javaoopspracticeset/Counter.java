package javaoopspracticeset;

/*
TODO:
    Create a class Counter with a static variable count that increases with each new object created.
    Print the count after creating 3 objects.
*/
public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Total objects created: " + count);
    }
}
