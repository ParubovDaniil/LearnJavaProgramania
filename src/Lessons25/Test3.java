package Lessons25;

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor d1 = (Doctor)emp1;//Используем кастинг
        System.out.println(d1.specializaciya);
        d1.health();
        (Doctor)emp1.health();
    }
}
class Employee  {
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Doctor extends Employee {
    String specializaciya;
    void health() {
        System.out.println("Health");
    }
}

class Teacher extends Employee{
    int kolichestvoUchenikov;
    void uchit(){
        System.out.println("Uchit");
    }
}
class Driver extends Employee{
    String nazvanieMashini;
    void vodit(){
        System.out.println("Vodit");
    }
}

