package Lessons19;

public class Test2 {
    static void summa(String s,int ... a){
        int summa=0;
        for(int i = 0;i<a.length;i++){
            summa +=a[i];
        }
        System.out.println(summa);
    }

    public void abc(int[]...array){}
    public static void main(String[] args) {
        summa("ok",6,3,10);
    }
/*    static void summa(int a,int b){
        System.out.println(a+b);
    }
    static void summa(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void summa(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }*/
}
