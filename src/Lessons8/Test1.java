package Lessons8;

public class Test1 {
    public final int a;

    public Test1(int a) {
        this.a = a;
    }
    public void abc(short s){
       final byte b =10;
        System.out.println(s+b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1(1);
        System.out.println();
    }
}
