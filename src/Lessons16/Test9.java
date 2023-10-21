package Lessons16;

public class Test9 {
    public static void main(String[] args) {
        String s1 = new String("Ok");
        String s2 = new String("Ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 != s4);

        String s10 ="Как дела?";
        String s11="как дела?";
        System.out.println(s10.equals(s11)); //false т.к буква "к" маленькая
        System.out.println(s10.equalsIgnoreCase(s11));//true т.к данный метод игнорирует маленькую или большую букву а смотрит суть
    }
}
