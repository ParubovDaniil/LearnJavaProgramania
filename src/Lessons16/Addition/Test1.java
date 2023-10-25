package Lessons16.Addition;
//is blank
//is empty
//strip, stripLeading, stripTrailing

public class Test1 {
    public static void main(String[] args) {
/*        String s1 = "Privet";
        System.out.println(s1.isBlank());//Если s1 состоит из прробела,таба,подобные символы то True,в остальных случаях false
        String s2 = "   ";
        System.out.println(s2.isBlank());//true*/
/*        String s3 = " ";
        System.out.println(s3.isEmpty());//Если пустой стринг ВООБЩЕ
        String s4 = "";
        System.out.println(s4.isEmpty());//Если пустой стринг ВООБЩЕ*/
        String s4 = "    privet     ";
        System.out.println(s4.stripLeading());//Удаляет в начале пробелы
        String s5 = "    privet     ";
        System.out.println(s5.stripTrailing());//Удаляет в конце пробелы
        String s6 = "poka";
        String s7 = s6.strip();//возвращает тот же объект в пул
        System.out.println(s6.equals(s7));

    }
}
