public class Main {
    public static void main(String[ ] args) {
//        Actual error --> out of bound hide show sout
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // error!
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Something went wrong");
        }
    }
}