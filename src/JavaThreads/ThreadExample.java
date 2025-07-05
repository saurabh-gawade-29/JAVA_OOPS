package JavaThreads;
// Thread start end isAlive

public class ThreadExample extends Thread{
    public static void main(String[] args) {
        ThreadExample obj = new ThreadExample();
        obj.start(); // 5 min
        //below portion - 10 min
        System.out.println("Hello Simran");
        System.out.println("Hello Simran");
        System.out.println("Hello Simran");
    }
    // thread method - override
    public void run(){
        System.out.println("Hello Saurabh");
    }
}
