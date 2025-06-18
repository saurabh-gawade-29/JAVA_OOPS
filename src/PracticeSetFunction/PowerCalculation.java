package PracticeSetFunction;
public class PowerCalculation {
    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        int base = 2, exponent = 10; // Example inputs
        System.out.println(base + " to the power " + exponent + " is: " + power(base, exponent));
    }
}
