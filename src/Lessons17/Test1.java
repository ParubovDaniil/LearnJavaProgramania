package Lessons17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();//по умолчанию 16
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50);//вместимость 50  capacity
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb3.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf(" "));
        System.out.println(sb2.indexOf("z"));
        System.out.println(sb2.indexOf("o",2));
        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5,8);
        System.out.println(s2);

        System.out.println(sb2.subSequence(5,8));//в оутпуте в отличии от substring тип char а не string

        /*sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append(new Test1());
        System.out.println(sb2);*/
        System.out.println(sb2.insert(sb2.length(),"Hello"));

        StringBuilder sb10 = new StringBuilder("Hello Wold");
/*        sb10.delete(3,6);
        System.out.println(sb10);*/
        sb10.deleteCharAt(6);
        System.out.println(sb10);
        sb10.reverse();//переворачивает
        System.out.println(sb10);
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0,5,"Pete");
        System.out.println(sb12);
        System.out.println(sb12.capacity());
        System.out.println(sb1.capacity());



    }
}
