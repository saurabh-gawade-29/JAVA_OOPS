package PracticeSetArrays;
import java.util.Scanner;

public class ArrayInputDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements are:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
