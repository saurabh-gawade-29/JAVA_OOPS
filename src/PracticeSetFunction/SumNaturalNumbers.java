package PracticeSetFunction;

public class SumNaturalNumbers {
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 100; // Example input
        System.out.println("Sum of natural numbers up to " + n + " is: " + sumOfNaturalNumbers(n));
    }
}
