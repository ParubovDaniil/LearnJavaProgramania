package Lessons20;

import Lessons10.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");//Можно указать позицию
        //list.add(5,"ok");
        for(String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(1,list2);
        list.set(1,"!!!!");
        for (String s:list){
            System.out.print(s+" ");
        }
        list.clear();//Очистить список.
        /*for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }*/
        /*System.out.println(list.get(3));*/
    }
}
