package Lessons22;

public class Test4 {
}

class Human2 {
    Human2(String n){
        this(n,null);
    }
    Human2(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
    String name;
    String surname;
}
class Student2 extends Human2{
Student2(){
    this(5);
    System.out.println("Hello");
}
Student2(int i){
    super("Petya");
}
    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}


