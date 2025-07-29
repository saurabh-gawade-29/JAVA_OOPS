package JavaFiles;
import java.io.File;
import java.io.IOException;

public class createPractice {
    public static void main(String[] args) throws IOException {
        File obj = new File("/Users/saurabhgawade/Documents/saurabh.txt");
        obj.createNewFile(); // create nahi kar raha he
        System.out.println("File Created with " + obj.getName());
    }
}
