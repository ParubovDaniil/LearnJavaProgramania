package Lessons22;

//Применяем наследование.
public class Test3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.specializaciya = "hirurg";
        doc.sleep();
        doc.eat();
        doc.health();
    }
}

class Employee extends java.lang.Object {
    String name;
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
    String name;
    int age;
    int experience;
    String specializaciya;

    void health() {
        System.out.println("Health");
    }
}

class Teacher {
    String name;
    int age;
    int experience;
    String kollichestvoUchenikov;

    void teach() {
        System.out.println("Health");
    }
}

class Driver {
    String name;
    int age;
    int experience;
    String nazvanieMashini;

    void vodit() {
        System.out.println("Health");
    }
}

class Hirurg extends Doctor {
    String skalpel;

    void operacia() {
    }
}

class Dantist extends Doctor {
}

