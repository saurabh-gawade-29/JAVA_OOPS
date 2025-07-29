package JavaFiles;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 5;
            int c = a + b;
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("the sum is " + c);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
