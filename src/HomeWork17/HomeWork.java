package HomeWork17;

public class HomeWork {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        System.out.println(sb1 == sb2);
        return sb1.equals(sb2);
    }

    public static void main(String[] args) {
        StringBuilder Hw1 = new StringBuilder(" ");
        StringBuilder Hw2 = new StringBuilder(" ");
        StringBuilder Hw3 = Hw2;
        System.out.println(HomeWork.ravenstvo(Hw1, Hw2));
        System.out.println(HomeWork.ravenstvo(Hw3, Hw2));
        System.out.println(HomeWork.ravenstvo(new StringBuilder("privet"),new StringBuilder("privet")));
        System.out.println(HomeWork.ravenstvo(new StringBuilder(),new StringBuilder()));
    }
}
//Wrong HomeWork
//sad
// Потому что метод equals не переопределён в классе StringBuilder поэтому 2 объекта равны когда
// их ссылки ссылаются на 1 объект и только