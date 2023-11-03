package Lessons20;

// в осное ArrayList лежит массив типа данных Object
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList<String>list2 = new ArrayList<>(30);//Могу добавить в список только тип данных String
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2==list5);
        list2.add("poka");

        ArrayList<StringBuilder> list3 = new ArrayList();
        list.add(s);
    }
}

class Car{}
class Student{}
