package Lessons20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String>list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        ArrayList<String>list2 = list1;
        System.out.println(list1.equals(list2));
        ArrayList<String>list3 = new ArrayList<>();
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);
        System.out.println(list1.equals(list3));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
//При сравнении обязательно важен порядок элементов и сами элементы
//Можно было импортировать класс ListIterator не значительна мог написать и так и так.
        Iterator<String> it = list1.iterator();//Итерация это повторение
        while(it.hasNext()){
            it.next();
            it.remove();
        }
        /*while(it.hasNext()){
            System.out.println(it.next());
        }*/

    }
}
