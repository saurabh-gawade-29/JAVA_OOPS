package JavaThreads;

class Oddnumbers implements Runnable{
    @Override
    public void run(){
        for(int num =1; num<=10; num+=2){
            synchronized (OddEvenThread.LOCK){
                while(!OddEvenThread.oddTurn){
                    try{
                        OddEvenThread.LOCK.wait();
                    } catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Odd number: " +num);
                OddEvenThread.oddTurn= false;
                OddEvenThread.LOCK.notify();
            }
        }
    }
}
// Step 1: Runnable Interface use karo
class OddEvenThread implements Runnable{
    static final Object LOCK= new Object(); //
    // Lock Object
    static volatile boolean oddTurn= true;
    @Override
    public void run(){
        for(int num=2; num<10; num+=2){ // here too
            synchronized(LOCK){
                while(oddTurn){
                    try{
                        LOCK.wait();
                    } catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Even numbers: " +num);
                oddTurn= true;
                LOCK.notify();
            }
        }
    }


    public static void main(String args[]){
        Thread oddThread= new Thread(new Oddnumbers(), "OddThread");
        Thread evenThread= new Thread(new OddEvenThread(),"EvenThread");
        oddThread.start();
        evenThread.start();
    }
}
