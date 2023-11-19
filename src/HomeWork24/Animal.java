package HomeWork24;

public abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Vsegda interesno nablyudat,kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name=name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
}

abstract class Mammal /*Млекопитающее*/ extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name=name;
    }

    abstract void run();

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name=name;
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnaya riva, i ona est obichniy ribiy korm");
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name=name;
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvin spyat prijavshis drug k drugu");
    }

    @Override
    void fly() {
        System.out.println("Pingvini cant fly");
    }

    @Override
    public void speak() {
        System.out.println("Pingvin cant sings like solovey");

    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name=name;
    }

    @Override
    void eat() {
        System.out.println("Lion likes meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion likes to sleep a lot");
    }

    @Override
    void run() {
        System.out.println("Lion is't the fast cat in the world");

    }
}

class Lessons24 {
    public static void main(String[] args) {

        Mechenosec m = new Mechenosec("Sablya");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();
        Speakable sp = new Pingvin("Mstr");
        sp.speak();
        Animal a = new Lev("Simba");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mm = new Lev("Mufasa");
        System.out.println(mm.name);
        mm.run();
        mm.eat();
        mm.speak();
        mm.sleep();
    }
}