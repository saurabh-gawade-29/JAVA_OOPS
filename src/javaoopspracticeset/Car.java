package javaoopspracticeset;

/*
TODO:
    Create a class Car with properties: make, model, and year.
    Create a constructor and a method displayInfo() to print the details.
    Create objects and display their details
*/
public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022);
        car.displayInfo();
    }
}
