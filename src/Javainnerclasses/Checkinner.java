package Javainnerclasses;

class Outerclass{
    class Innerclass{
        int a = 5;
    }
}

public class Checkinner {
    public static void main(String[] args) {
        Outerclass obj = new Outerclass(); // step 1
        Outerclass.Innerclass obj2 = obj.new Innerclass(); //inner class
        System.out.println(obj2.a);
    }
}
