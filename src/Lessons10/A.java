package Lessons10;

import Lessons4.Car;
import Lessons9.Student;
import Lessons9.*;//Значит что все классы из пакета импортированы
//Если вдруг импортированы классы с одинаковыми именами нужно прописывать полное имя при создании объекта.
public class A {
    public static void main(String[] args) {
        Car c1 = new Car();
        Lessons4.Car c2 = new Lessons4.Car();
        Lessons9.Student st1 = new Student();//Если вдруг
        Student st2 = new Student();
    }
}
