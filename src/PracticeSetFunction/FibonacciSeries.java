package PracticeSetFunction;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        printFibonacci(n);
    }
}
