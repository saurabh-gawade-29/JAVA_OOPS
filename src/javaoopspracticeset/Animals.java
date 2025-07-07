package javaoopspracticeset;
/*
TODO:
    Create a parent class Animal with method makeSound().
    Create two child classes Dog and Cat that override makeSound() with "Bark" and "Meow" respectively.
*/
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound();
        a2.makeSound();
    }
}
