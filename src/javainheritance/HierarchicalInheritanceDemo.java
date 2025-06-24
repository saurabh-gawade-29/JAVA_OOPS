package javainheritance;

// Parent class
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child class 1
class Circle extends Shape {
    void area() {
        System.out.println("Area = π * r * r");
    }
}

// Child class 2
class Rectangle extends Shape {
    void area() {
        System.out.println("Area = length * breadth");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.display();    // Inherited from Shape
        circle.area();       // Specific to Circle

        rectangle.display(); // Inherited from Shape
        rectangle.area();    // Specific to Rectangle
    }
}
