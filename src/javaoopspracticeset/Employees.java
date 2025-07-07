package javaoopspracticeset;

/*
TODO:
    Create an abstract class Employee with abstract method calculateSalary().
    Extend it with FullTimeEmployee and PartTimeEmployee classes,
    each implementing their own version of calculateSalary().
*/
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name) {
        super(name);
    }

    public double calculateSalary() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name) {
        super(name);
    }

    public double calculateSalary() {
        return 20000;
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Saurabh");
        Employee e2 = new PartTimeEmployee("Snehal");

        System.out.println(e1.name + " earns " + e1.calculateSalary());
        System.out.println(e2.name + " earns " + e2.calculateSalary());
    }
}
