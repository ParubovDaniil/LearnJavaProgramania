package Lessons25;

public class Test6 {
    public static void main(String[] args) {
//        byte b = 10;
//        int a = b;//Расширение windening
//        System.out.println(7);
//        int i1 = 3;
//        //short s2 = i1;//без кастинга не пропускает или можно сделать i1 константой
//        byte b2 = 3;//narrowing значение большего типа данных присваивается меньшему типу
//        short s1 = -6;
//        short s2 = (short) i1;//casting with narrowing
//        char c1 = 100;
//        long l1 = 1;
//        int i2=(int)l1;
//        int i10 = 111111;
//        short s10=(short) i10;
//        System.out.println(s10);//Потеряли информацию т.к принимаем значение больше максимального
//        char c10 = (char)-8;
//        System.out.println(c10);
////        int i11 = (int)true;
////        boolean b = true;
//        int i12 = (int)3.14;
//        System.out.println(i12);
//        double d = 5435435.523;
//        byte b12 = (byte)d;
//        System.out.println(b12);
//        int i = 2147483647;
//        System.out.println(i+1);
        int i = 5;
        long l = 10;
        // i = i*l;//кастинг не происходит
        i *= l;// кастинг происходит автоматически
        //i = (int)(i*l);
        System.out.println(i+l);//сначала i конвертируется в long
        float f = 3.14f;
        int i2 = 10;
        System.out.println(f+i2);

        byte b = 3;
        short s = 4;
        char c = 5;
        System.out.println(b+s+c);//все будут конвертированы в инт
        System.out.println(b++);//b конвертироваться не будет

        byte b2 = 10;
        float f2 = 7;
        double d2 = 2.0;
        double i5 = b2+f2-d2;//Только double может принять данное значение
        System.out.println(b2+f2-d2);//b2 в инт затем в float после результат конвертируется в double

        double d10 = 3.14;
        float f10 = 6.28f;

        float f11 = 0*1.5f;
        float f12 = 0*(float)(1.5);

    }
}
