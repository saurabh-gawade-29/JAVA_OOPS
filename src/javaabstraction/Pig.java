package javaabstraction;

// Data Hiding
// Parent Class - Secrets
 interface Animal{
     void animalsound();
     void animalColor();
}



class Pig implements Animal{
    public void animalsound() {
        System.out.println("pig say wee wee");
    }

    public void animalColor(){
        System.out.println("pig color is brown");
    }
}