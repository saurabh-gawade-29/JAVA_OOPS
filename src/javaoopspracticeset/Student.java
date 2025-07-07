package javaoopspracticeset;
/*
TODO:
    Create a class Student with overloaded constructors:
        •	One that takes only name
        •	Another that takes name and age
        •	Another that takes name, age, and grade
*/
public class Student {
    String name;
    int age;
    char grade;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Saurabh");
        Student s2 = new Student("Snehal", 22);
        Student s3 = new Student("Prasad", 23, 'A');
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}
