package overloadride;

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Sound");
    }
    // @override
    void makeSound(){
        super.sound();
    }
}

class Javamethodoverride{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
    }
}
