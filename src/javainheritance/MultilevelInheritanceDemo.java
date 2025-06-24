package javainheritance;

// Base class
class Vehicle {
    void start() {
        System.out.println("The vehicle starts.");
    }
}

// Intermediate class
class Car extends Vehicle {
    void drive() {
        System.out.println("The car drives.");
    }
}

// Derived class
class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("The electric car is charging.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();        // Inherited from Vehicle
        tesla.drive();        // Inherited from Car
        tesla.chargeBattery();// Specific to ElectricCar
    }
}
