package JavaEnums;

//TODO: Global Scope -- yaha pe jo bhi declare karoge

enum Level{
    LOW,
    MEDIUM,
    HIGH
}

// Level: enum  --> string , int, boolean

public class Main {
    public static void main(String[] args) {
        String myVar = String.valueOf(Level.MEDIUM);
        Level check = Level.HIGH;
        System.out.println(myVar); // string
        System.out.println(check); // object / Level
    }
}

//TODO: pi=3.14 --> chnage nahi ho sakti -->

