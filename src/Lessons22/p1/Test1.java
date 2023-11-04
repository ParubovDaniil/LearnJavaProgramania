package Lessons22.p1;
import Lessons22.Chelovek;
public class Test1 {
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
