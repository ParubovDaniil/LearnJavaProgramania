package Lessons23;

public class Test2 {
    //    public Doctor abc(){
//        return new Doctor();
//    }
//    public Object abc(){
//        return new String(" ");//Не любой Object это String,Но любой String это Object поэтому такая запись допустима
//    }
//    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();//референс тип ссылается на объект типа работник
//        Xirurg x = new Xirurg();
//        Employee emp1 = new Doctor();//так же может ссылаться на объект подкласса Доктор это работник. Doctor is a Employee
//        System.out.println(emp1.salary);
//        System.out.println(emp1.name);
//        System.out.println(emp1.age);
//        System.out.println(emp1.experience);
//        emp1.sleep();
//        emp1.eat();
////        emp1.health();//Нельзя потому что у объекта Employee нету метода health
//        Employee emp2 = new Teacher();//Teacher is a Employee
//
//        Employee emp3 = new Driver();
//
//        //Работник не обязательно водитель или учитель или доктор но Доктор обязательно работник
//
//        Doctor d2 = new Xirurg();
//        System.out.println(d2.age);
//        System.out.println(d2.name);
//        System.out.println(d2.experience);
//        d2.eat();
//        d2.health();
////        System.out.println(d2.skalpel);//Нельзя потому что переменная в классе наследнике находится
//        Employee emp4 = new Xirurg();
//        emp4.eat();
//        emp4.sleep();
//        System.out.println(emp4.age);//вывести скальпель или метод операция из класса Хирург не смогу по той же причине.
//    }
//}

/*
class Employee {
    double salary = 100;
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
    void health() {
        System.out.println("Health");
    }
}

class Xirurg extends Doctor {
    String skalpel;

    void operacia() {

    }
}

class Teacher extends Employee {
    int kollichestvoUchenikov;

    void teach() {
        System.out.println("Health");
    }
}

class Driver extends Employee {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Health");
    }*/
}

