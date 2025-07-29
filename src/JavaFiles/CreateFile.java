package JavaFiles;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("Simran.txt");
            if (myObj.createNewFile()) { // File Creation
                System.out.println("File created: " + myObj.getName()); // return filename
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}