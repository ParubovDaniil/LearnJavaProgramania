package Lessons21;

public class Test3 {
    Test3(){
        System.out.println("Eto konstructor");
    }
    void Test3() {
        int Test3=5;
        System.out.println("Создался объект");
    }
    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
