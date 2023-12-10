package Lessons26;

public class Test3 {
    void abc(int i) {
        System.out.println("int");// в 1ую очередь
    }

    void abc(byte i) {
        System.out.println("byte");
    }

    void abc(long i) {
        System.out.println("long");// в 1ую очередь
    }

    void def(Object o) {
        System.out.println("Object");
    }

    void def(String o) {
        System.out.println("String");// в 1ую очередь
    }

    void ghi(int a, int b) {
        System.out.println("Hello 1");//в 1ую очередь
    }

    void ghi(long a, long b) {
        System.out.println("Hello 2");//во 2ую очередь
    }

    void ghi(Integer a, Integer b) {
        System.out.println("Hello 3");//в 3тью очередь
    }

    void ghi(int... a) {
        System.out.println("Hello 4");//Последний
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);
        t.def("hello");
        t.ghi(1, 2);
    }
}
