package Lessons16;

public class Test6 {
    public static void main(String[] args) {
        String s = "PrIvEt:2";
        String s2=s.toLowerCase(); // делает все буквы маленькими
        System.out.println(s2);

        String s3 = s.toUpperCase(); // делает все буква маленькими
        System.out.println(s3);

        boolean b = s.contains(":2");// содержит ли он в себе
        System.out.println(b);

        boolean b1 = s.contains(":3");//содержит ли он в себе
        System.out.println(b1);
    }
}
