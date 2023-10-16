package HomeWork3;

public class HomeWork3 {
    public static void main(String[] args) {
        //1
        int i1=5;
        int i2=11;
        double d1=5.5;
        double d2=1.3;
        long l = 20L;
        double result;
        result = i2/d1+d2%i1-l;//2+1.3-20
        System.out.println(result);
        //2
        int a =5;//4 3 4 4 (5)
        int b =8;//9 10 11 (8)
        a =a-- - --a + ++a + a++ + a;//5-3+4+4+5=15
        b =++b - b++ + ++b - --b;//9-9+11-10=1
        System.out.println(a);
        System.out.println(b);
    }
}
