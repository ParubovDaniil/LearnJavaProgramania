package Lessons26;

public class Test4 {
    static void abc(String s){
        System.out.println("A");//1
    }
    static void abc(String ... s){
        System.out.println("B");//3
    }
    static void abc(Object s){
        System.out.println("C");//2
    }
    static void abc(String s1,String s2){
        System.out.println("D");//4
    }

    static void def(Long a){
        System.out.println("E");
    }
    static void def(Long ... a){
        System.out.println("F");
    }
    static void def(long a){
        System.out.println("G");
    }
    static void def(Object a){
        System.out.println("H");
    }
    static void def(Integer a){
        System.out.println("I");
    }
    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("ok");//A,C,B,D
        t.abc("ok","!!!");//D,B
        t.abc("ok","!!!","77");//B
        t.def(50l);
        t.def(50);
    }
}
