package JavaThreads;

public class JThreadH1 extends Thread {
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello From Thread!");
            try{
                // 1000 milis = 1 sec
                Thread.sleep(10000);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void main(String args[]){
        Thread t= new JThreadH1();
        t.start();
        try{
            t.join();
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
