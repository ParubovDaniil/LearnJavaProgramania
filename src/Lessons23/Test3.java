package Lessons23;

import HomeWork10.p4.p5.E;

public class Test3 {
    public static void main(String[] args) {
        Employeee e = new Teacherr();
        e.eat();
        /*new Employeee();
        Teacherr t = new Teacherr();
        t.eat();
        e.eat();*/
    }
}

class Food {
}

class Fruit extends Food {
}

class Employeee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

   public Food food() {
        System.out.println("Kushaet rabotnik");
        Food f = new Food();
        return f;
    }

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Teacherr extends Employeee {
    int kollichestvoUchenikov;

    void eat() {
        System.out.println("kushaet teaher");
    }

   public Food food() {
        System.out.println("Kushaet Teacher");
        Fruit f = new Fruit();
        return f;
    }

    void teach() {
        System.out.println("Health");
    }
}

/*class A {
    Employeee objectCreation() {
        return new Employeee();
    }
}*/

/*class B extends A {
    Teacherr objectCreation() {
        System.out.println("ok");
        return new H();
    }
}

class H extends Teacherr{}*/

