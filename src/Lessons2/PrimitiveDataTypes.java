package Lessons2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
//all variables in java are strongly typed
//Тип данных-Имя переменной=Значение переменной
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 127;

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 1000000000000L;/*where I use long data type,i should write "L"*/
        long l3 = 51L;

        float f1 = 3.14F;
        float f2 = 2.4f;
        float f3 = 20;

        double d1 = 5.5;
        double d2 = 87.65d;

        char c1 = 'a';
        char c2 = 'A';
        char c3 = '6';
        char c4 = ' ';

        char c5 = 300;// значение с5 = 300 символу в юникоде//10-ричная
        char c6 = '\u03AB';//16-ричная 16 ABCDEF

        boolean bool1 = true;
        boolean bool2 = false;


        int a1 = 60;
        int a2 = 0B111100;//0B-показывает что число в двоичной системе
        int a3 = 074;//0-компилятор понимает что число в 8-ричной
        int a4 = 0x3C;//0x-показывет что число в 16-ричной
        int a5 = 0x3c;

        int a7 = 1_000_000_000;

        System.out.println(a5);


    }
}
