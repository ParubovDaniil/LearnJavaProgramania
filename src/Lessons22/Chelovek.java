package Lessons22;

import HomeWork10.p1.p2.p3.C;

public class Chelovek {
    final String gender;

   public Chelovek(String gender) {
        this.gender = gender;
    }
    private boolean clever;
    public boolean isClever(){
        return clever;
    }
    private String name; //применил инкапсуляцию(показывать имя и изменять его)
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int i){
        if(i>0){
            age=i;
        }
    }
    private int weight;
    public int getWeight(){
        return weight;
    }
    public void setWeight(int i){
        if(i>0){
            weight=i;
        }
    }
}
class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setWeight(50);
        c.setAge(15);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getWeight());



    }
}
