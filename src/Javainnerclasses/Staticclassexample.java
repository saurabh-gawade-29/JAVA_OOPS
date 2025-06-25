package Javainnerclasses;

class Outer{
    static class Inner{
        int a = 5;
    }
}

public class Staticclassexample {
    public static void main(String[] args) {
        // Inner Class -- Static --> no need to create object of outer class
        Outer.Inner myInner = new Outer.Inner();
        System.out.println(myInner.a);
    }
}
