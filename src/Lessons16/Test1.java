package Lessons16;

public class Test1 {


    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        int a = s1.length();// длина
        System.out.println(a);
        System.out.println(s1.length());

        char c1 = s1.charAt(4); // выводит символ по счёту
        System.out.println(c1);

        int i1 = s1.indexOf('t'); // выводит индекс символа по счёту *5
        System.out.println(i1);

        int i2 = s1.indexOf("vet"); // выводит индекс симола по счёту *3
        System.out.println(i2);

        int i3 = s1.indexOf("Z");
        System.out.println(i3);

        int i4 = s1.indexOf("a",5);//с какого индекса начать поиск начать
        System.out.println(i4);

        int i5 = s1.indexOf('b',5);//с какого индекса начать поиск начать
        System.out.println(i5);


        boolean b1 = s1.startsWith("abc"); // начинается с.... true
        System.out.println(b1);

        boolean b2 = s1.startsWith("abc",7); // начинается с.... true
        System.out.println(b2);

        boolean b3 = s1.endsWith("cd"); // заканчивается с
        System.out.println(b3);
    }
}
