package PracticeSetArrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        for (int element : array) {
            if (element > largest) {
                largest = element;
            }
        }

        System.out.println("Largest element is: " + largest);
        scanner.close();
    }
}
