package Javainnerclasses;

class A {
   static int a = 5;
   static void sound(){
       System.out.println("check");
   }
}


public class Staticexample extends A {
    public static void main(String[] args) {
        //A obj = new A();
        System.out.println(a);
        sound();
    }
}
