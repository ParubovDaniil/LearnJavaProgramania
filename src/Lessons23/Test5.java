package Lessons23;

import HomeWork10.p4.p5.E;

public class Test5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Teacher t = new Teacher();
        //emp.sleep();
        Employee e = new Teacher();
        emp.sleep();
        e.sleep();
    }

}
class Eda{
}
class Frukti extends Eda{}

class Employee {
    double salary = 100;
    String name="Kolya";
    public Eda eat() {
        System.out.println("Eating rabotnik");
        Eda e = new Eda();
        return e;
    }

    static void sleep() {
        System.out.println("Sleeping");
    }
}

class Teacher extends Employee {
    @Override
    public Eda eat(){
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }
    int kollichestvoUchenikov;

    void teach() {
        System.out.println("Health");
    }
    static void sleep(){
        System.out.println("Spit Teacher");

    }
}
