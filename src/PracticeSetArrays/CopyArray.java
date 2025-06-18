package PracticeSetArrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] sourceArray = new int[n];
        int[] targetArray = new int[n];

        System.out.println("Enter the elements of the source array:");
        for (int i = 0; i < n; i++) {
            sourceArray[i] = scanner.nextInt();
        }

        // Copying elements
        for (int i = 0; i < n; i++) {
            targetArray[i] = sourceArray[i];
        }

        System.out.println("Elements in the target array:");
        for (int element : targetArray) {
            System.out.print(element + " ");
        }
        scanner.close();
    }
}
