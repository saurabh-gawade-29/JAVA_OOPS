package javainheritance;

// Example 1: Hybrid Inheritance
interface Movable {
    void move();
}

interface Programmable {
    void program();
}

class Robot implements Movable, Programmable {
    @Override
    public void move() {
        System.out.println("The robot moves forward.");
    }

    @Override
    public void program() {
        System.out.println("The robot is being programmed.");
    }
}

// Example 2: Multiple Inheritance
interface Connectable {
    void connect();
}

interface Operable {
    void operate();
}

class SmartDevice implements Connectable, Operable {
    @Override
    public void connect() {
        System.out.println("The smart device connects to Wi-Fi.");
    }

    @Override
    public void operate() {
        System.out.println("The smart device is operational.");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        // Testing Hybrid Inheritance
        Robot robot = new Robot();
        System.out.println("Hybrid Inheritance Example:");
        robot.move();
        robot.program();

        // Testing Multiple Inheritance
        SmartDevice device = new SmartDevice();
        System.out.println("\nMultiple Inheritance Example:");
        device.connect();
        device.operate();
    }
}
