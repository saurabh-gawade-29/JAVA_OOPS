package overloadride;

public class Javamethodoverload {
//    Complie time polymorphism -- jo error aapko compile karte he aa jaye
    static void hello(){
        System.out.println("Hello from method");
    }

    static void hello(int a){
        System.out.println("Hello from method with parameter"+ a);
    }

    static  void hello(int a, int b){
        System.out.println(a+b);
    }
    // java --> exact same method name method declartion nahi kar sakte
    public static void main(String[] args) {
        hello();
        hello(5);

    }
}
