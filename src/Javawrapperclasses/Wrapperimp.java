package Javawrapperclasses;

public class Wrapperimp {
    public static void main(String[] args) {
//        int a = 100; //? this is not a instance of class
        Integer a = 100;
        // class -> methods --> call
        String check = a.toString(); // methods
        int len = check.length();
        System.out.println(len);
    }
}
