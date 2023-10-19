package Lessons15;

public class Test7 {
    public static void main(String[] args) {
        int money=100;
        do{
            System.out.println("delayte stavky");
            System.out.println("Vi proigraly");
            money-=10;
        }
        while (money>50);
        System.out.println(money);
    }
}
