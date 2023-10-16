package HomeWork6;

public class HomeWork6 {
    HomeWork6(){
    }
   static void overloadingMethod(){
        System.out.println(0);
    }
    static  int overloadingMethod(int a){
        System.out.println(a);
        return a;
    }
    static int overloadingMethod(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    static int overloadingMethod(int a,int b, int c){
        System.out.println(a+b+c);
        return a+b+c;
    }
    static int overloadingMethod(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
        return a+b+c+d;
    }

    public static void main(String[] args) {
        HomeWork6.overloadingMethod();
        HomeWork6.overloadingMethod(1);
        HomeWork6.overloadingMethod(1,2);
        HomeWork6.overloadingMethod(1,2,3);
        HomeWork6.overloadingMethod(1,2,3,4);
    }

}
class HomeWork7Test{
    public static void main(String[] args) {
        HomeWork6 fst = new HomeWork6();
        fst.overloadingMethod();
        fst.overloadingMethod(1);
        fst.overloadingMethod(1,2);
        fst.overloadingMethod(1,2,3);
        fst.overloadingMethod(1,2,3,4);

    }
}

