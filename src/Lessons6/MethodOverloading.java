package Lessons6;

public class MethodOverloading {//перегрузка = overloading
    void show(int i1){
        System.out.println(i1);
        System.out.println("Data Type is Int");
    }

    void show(String s,int a){
        System.out.println("String: "+s + "int: "+a);

    }
    void show(int a,String s){
        System.out.println("String: "+s + "int: "+a);

    }
    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data Type is Bool");

    }
    void show(String s1){
        System.out.println(s1);
        System.out.println("Data Type is String");

    }

}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        mO.show(100);
        int a = 500;
        mO.show(a);
        boolean b= true;
        mO.show(b);
        String s1 = "Privet";
        mO.show(s1);
        mO.show("Privet",100);
    }
}
