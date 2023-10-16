package HomeWork8;

public class Test1 {
    static double umnozhenie(double a, double b, double c){
        return a*b*c;
    }
    public static void delenie(int a,int b){
        System.out.println("Целое частное: "+ a / b + "; Остаток = " + a % b);
    }
}
class Test2{
    public static void main(String[] args) {
        System.out.println(Test1.umnozhenie(2,3,4));
        Test1.delenie(9,2);
        System.out.println(Test1.umnozhenie(2.5,3.5,2.3));
        Test1.delenie(15,4);
    }
}
