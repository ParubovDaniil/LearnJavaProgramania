package HomeWork23.p2;

import HomeWork23.C;
public class V extends C {
    public void abc(){
        System.out.println('Y');
    }
    public void def(){
        V v = new V();
        v.abc();
    }
/*    public void ghi(){
        C c = new C();
        c.abc();
    }*/

    public static void main(String[] args) {
        V a = new V();
        a.abc();
        a.def();
/*        a.ghi();*/
    }
}
//Результатом будет ошибка