package JavaFiles;

import java.io.File;  // Import the File class

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        File myObj2 = new File("/Users/saurabhgawade/Developer/Java/JAVA_OOPS/test");
        if(myObj.delete()){
            System.out.println("Deleted the file: " + myObj.getName());
        }
        if (myObj2.delete()) {
            System.out.println("Deleted the folder");
        } else {
            System.out.println("Failed to delete the file / Folder");
        }
    }
}
