package javaopps;

// Blueprint
class Car {
    // Variables
    int noOfWheels = 4;
    int noOfLights = 4;
    String logo = "Default Logo";

    // Methods
    void honk() {
        System.out.println("tut tut");
    }

    // Setter method for noOfWheels
    void setNoOfWheels(int wheels) {
        noOfWheels = wheels;
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car mustang = new Car();
        Car gwagon = new Car();

        // Update noOfWheels for gwagon
        gwagon.setNoOfWheels(6);

        System.out.println("Mustang Wheels: " + mustang.noOfWheels);
        System.out.println("G-Wagon Wheels: " + gwagon.noOfWheels);
        System.out.println(mustang.logo);
        System.out.println(mustang.noOfLights + mustang.noOfWheels);
        mustang.honk();
    }
}