package javaoopspracticeset;

/*
TODO:
    Create an interface Flyable with method fly().
    Implement it in classes Bird and Airplane with their own version of fly().
*/

interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird flies using wings");
    }
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane flies using engines");
    }
}

public class Flyables {
    public static void main(String[] args) {
        Flyable f1 = new Bird();
        Flyable f2 = new Airplane();
        f1.fly();
        f2.fly();
    }
}
