package javaoopspracticeset;

/*
TODO:
    Create a class Product with name and price.
    Use this keyword in the constructor to set values.
    Add a method display() to print the values.
*/
public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;      // Using 'this' to refer to current object
        this.price = price;
    }

    void display() {
        System.out.println(name + " costs ₹" + price);
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 49999.99);
        p.display();
    }
}
