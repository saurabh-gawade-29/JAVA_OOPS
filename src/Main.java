public class Main {
    static int v = 5;
    public static void main(String[] args) {
        int a = 100;
        //block
        {
            int c = 50;
            System.out.println(c);
            System.out.println(v);
        }
        System.out.println(a);
        System.out.println(v);
    }
}