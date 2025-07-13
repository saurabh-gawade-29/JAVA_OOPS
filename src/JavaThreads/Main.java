package JavaThreads;

public class Main implements Runnable {
    int a = 6;
    public static void main(String[] args) {
        Main obj = new Main();
        Thread objT = new Thread(obj);
        objT.start();
        System.out.println("inside main method");
    }
    public void run(){
        System.out.println("Check");
    }
}


// Class:  Thread  ----> Obj Create
// attributes:
// Variable: int a = 5;
// Methods
// eg: run()
