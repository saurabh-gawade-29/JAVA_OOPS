package javaencapsulation;

//TODO: https://www.geeksforgeeks.org/java/encapsulation-in-java/
class Programmer{
    private String name;

    public String getName(){
        return name;
    }

    public String setName(String addName){
        this.name = addName;
        return name;
    }
}

public class Javaencapsulation {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("simran");
        System.out.println(p.getName());
    }
}
