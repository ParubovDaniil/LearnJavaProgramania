package Lessons24;

public class Test5 {
}
interface I1{
    //default метод в интерфесе всегда имеет тело
   default void abc(){
       System.out.println("eto metod abc");
   };
   static void def(){
       System.out.println("static method");
   }
/*    default void ghi(){
        System.out.println("eto metod ghi");
    };
    default void fef(){
        System.out.println("Etot method fef");
    }*/
}
interface I2 extends I1{
    default void abc(){
        System.out.println("eto metod abc!!!!");
    }
}
abstract class O{
}
/*abstract*/ class R extends O implements I1{
 static I2 method1(I2 i){return new D2() ;}

    public static void main(String[] args) {
     I2 i = new D2();
     method1(i);
    }
    /*   @Override
    public void abc(){
        System.out.println("eto metod abc!!!!");
    }*/
}
class D2 implements I2{}
/*
class Z2 implements I1{
    //В Отличие от абстрактного метода в интерфейсе дефоулт метод всегда имеет тело
    //слово default в методе интерфейса не имеет отношения к access modifier
    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.fef();
        z.ghi();
    }
    @Override
    public void abc(){
        System.out.println("eto method abc");
    }
}*/
