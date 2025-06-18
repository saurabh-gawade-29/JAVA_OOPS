package PracticeSetFunction;

public class GCD {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 56, num2 = 98; // Example inputs
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + findGCD(num1, num2));
    }
}
