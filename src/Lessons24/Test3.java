package Lessons24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.help();
        h.tushutPojar("вода");
        s.swim();
    }
}
    class Employee {
        double salary = 100;
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
class Driver extends Employee implements Swim_able, Help_able {
    String nazvanieMashini;

    void drive() {
        System.out.println("Health");
    }

    @Override
    public void swim() {
        System.out.println("Водитель может плавать");

    }

    @Override
    public void help() {
        System.out.println("Водитель оказывает помощь");

    }

    @Override
    public void tushutPojar(String s) {
        System.out.println("Водитель тушит пожар с помощью" + s);

    }
}

    class Teacher extends Employee implements Help_able {
        int kollichestvoUchenikov;

        void teach() {
            System.out.println("Health");
        }

        @Override
        public void help() {
            System.out.println("Учитель оказывает помощь");
        }

        @Override
        public void tushutPojar(String s) {
            System.out.println("Учитель тушит пожар с помощью " + s);
        }
    }
//Интерфейс может содержать абстрактные методы
//Все методы интерфейса являются public поэтому при реализации нужно указывать именно public
//Интерфейс содержит только константы(если содержит)
    interface Help_able { //Конструктор не нужен конструкции которая не может создавать объект
        abstract void help();

        abstract void tushutPojar(String predmet);
        public final static int a = 10;
    }

    interface Swim_able {
        void swim();
    }
abstract class Y implements Swim_able{}
abstract class X extends Y{}
class Z extends Y{
    @Override
    public void swim(){}
}