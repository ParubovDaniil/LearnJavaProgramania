package Lessons22;

import java.util.SortedMap;

public class Human {
    protected String name="Kolya";
    protected static int salary = 150;

    protected void work() {
        System.out.println("rabotat");
    }
    protected static void reat() {
        System.out.println("Rest");
    }
}
class Student extends Human{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.reat();
    }
}
