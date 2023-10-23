package HomeWork16;
public class HomeWork {
    static void email(String s){
        String s2 = s.substring(3,8);
        String s3 = s.substring(17,21);
        String s4 = s.substring(30,35);
        System.out.print(s2);
        System.out.println();
        System.out.print(s3);
        System.out.println();
        System.out.print(s4);
    }
    public static void main(String[] args) {
        String s0 = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        email(s0);
    }
}

