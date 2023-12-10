package Lessons26;

public class Test7 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Lion l = new Lion();
    }
}
class Animal{
    Animal(){
        System.out.println("Constructor of animal");
    }
    static{
        System.out.println("static init in animal");
    }
    {
        System.out.println("non--static init in animal");
    }
}
class Mammal extends Animal{
    Mammal(){
        System.out.println("Constructor of Mammal");
    }
    static{
        System.out.println("static init in Mammal");
    }
    {
        System.out.println("non--static init in Mammal");
    }
}
class Lion extends Mammal{
    Lion(){
        System.out.println("Constructor of Lion");
    }
    static{
        System.out.println("static init in Lion");
    }
    {
        System.out.println("non--static init in Lion");
    }
}