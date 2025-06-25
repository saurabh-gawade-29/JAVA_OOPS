package javapolymorphism;

import javax.crypto.spec.PSource;

class Animal{
    // constructor -- obj --> automatic call
    Animal(){
        System.out.println("i am calling");
    }
    String type = "deer";
    int a = 5;
    void sound(){
        System.out.println("Animal make a sound");
    }

}

class Dog extends Animal{
//    constructor - obj -automatic call
    Dog(){
     super(); // super()  --> Parent Constructor call
    }
    void sound() {
        // Super Keyword --- Without creating object
        super.sound();
        int num1 = super.a;
        int num2 = 5;;
        System.out.println(num1 + num2);
        System.out.println(super.type);
        System.out.println("Dog Bark");
    }
}


public class poly {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.sound();
    }
}
