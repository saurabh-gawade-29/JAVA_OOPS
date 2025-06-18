package PracticeSetFunction;
public class PrimeCheck {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 29; // Example input
        System.out.println(number + " is prime: " + isPrime(number));
    }
}
