package Lessons16;

public class Test2 {

    public static void main(String[] args) {
        String s1 = new String("privet");
 /*       String s10 = s1.substring(3); // присвоит с такого то индекса
        System.out.println(s10);

        String s11 = s1.substring(3, 7); // с такого то, по такой то не включая последний
        System.out.println(s11);

        String s12 = s11.trim(); // не принимает никаких параметров и возвращает string, убирает пробелы в начале и в конце
        System.out.println(s12);

        String s13 = s1.substring(3,11);// если нужно что бы вошёл полный смысл то писать нужно индекс 11,хотя он не существует
        System.out.println(s13);*/

        //replace - заменить
        String s14 = s1.replace('r', 'z');// меняет символы
        System.out.println(s14);
        System.out.println(s1 == s14);//true

        String s15 = s1.replace("vet", "vivka");// или 2 стринга или 2 чара
        System.out.println(s15);

        String s2 = "poka";
        String s3 = s2.replace('k', 'k');
        System.out.println(s2 == s3);//true,но если поставить "" "" как стринг то будет false

        String s5 = "privet";
        String s6 = "drug";
        System.out.println(s5.concat(s6));//(s5+s6)
    }
}
