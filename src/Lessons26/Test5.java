package Lessons26;

public class Test5 {
    {
        //s1 = "ok";
        System.out.println("Eto init blok 3");
//        int a = 5;
//        System.out.println(a);
    }
    Test5(){
        System.out.println("Eto kostructor 1");
    }
    Test5(int a ){
        this();
        System.out.println("Eto kostructor 2");
    }
    String s1;
    {
        //s1 = "ok";
        System.out.println("Eto init blok 1");
//        int a = 5;
//        System.out.println(a);
    }
    static {
        //s1 = "ok";
        System.out.println("Eto STATIC init blok 1");
//        int a = 5;
//        System.out.println(a);
    }
    {
        //s1 = "ok";
        System.out.println("Eto init blok 2");
//        int a = 5;
//        System.out.println(a);
    }
    static {
        //s1 = "ok";
        System.out.println("Eto STATIC init blok 2");
//        int a = 5;
//        System.out.println(a);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t2 = new Test5(3);
    }
}
