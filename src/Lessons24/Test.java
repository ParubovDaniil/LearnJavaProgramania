package Lessons24;

public class Test {
}
interface I{
    private static void method1(){
        System.out.println("static method1");
    }

    abstract void method2();
//    private void method2() {
//        System.out.println("non-static method");
//    }
    default void method3(){
        method1();
        method2();
    }
    static void method4(){
        method1();
    //    method2();
    }
}
