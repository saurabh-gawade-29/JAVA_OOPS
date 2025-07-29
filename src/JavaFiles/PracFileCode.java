package JavaFiles;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

class Student{
    void display(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

}

public class PracFileCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String firstName = sc.nextLine();
        System.out.println("Enter Your Last Name");
        String lastName = sc.nextLine();
        Student obj = new Student();
        obj.display(firstName, lastName);
        try {
            FileWriter fw = new FileWriter("Student.txt");
            fw.write(firstName + " " + lastName);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
