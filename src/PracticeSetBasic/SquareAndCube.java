package PracticeSetBasic;
import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int square = num * num;
        int cube = num * num * num;

        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
    }
}
