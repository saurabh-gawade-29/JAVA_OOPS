package javaoopspracticeset;

abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    double radius = 5;

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    int length = 10, width = 5;

    public double area() {
        return length * width;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}
