package javaoopspracticeset;

/*
TODO:
    Create a class Calculator with multiple add() methods to:
	•	Add two integers
	•	Add two doubles
	•	Add three integers
*/
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.7));
        System.out.println(calc.add(1, 2, 3));
    }
}
