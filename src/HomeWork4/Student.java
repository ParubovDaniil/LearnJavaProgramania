package HomeWork4;

public class Student {
    String name;
    int StudTick;
    String surname;
    int yearsstudy;
    double srMath;
    double srEconomy;
    double srLanguage;
    double srArifm;
}
class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.name = "Daniil";
        st1.StudTick = 1;
        st1.surname="Parubov";
        st1.yearsstudy=2022;
        st1.srMath = 5;
        st1.srEconomy=5;
        st1.srLanguage=6;
        st1.srArifm=(st1.srLanguage+st1.srMath+ st1.srEconomy)/3;
        System.out.println(st1.name+st1.surname+" Номер студенческого №"+st1.StudTick+" Год поступления:"+st1.yearsstudy+" "+st1.srArifm);

        Student st2 = new Student();
        st2.name = "Elvira";
        st2.StudTick = 2;
        st2.surname="Sibgatullina";
        st2.yearsstudy=202000;
        st2.srMath = 6;
        st2.srEconomy=10;
        st2.srLanguage=34;
        st2.srArifm=(st2.srLanguage+st2.srMath+ st2.srEconomy)/3;
        System.out.println(st2.name+st2.surname+" Номер студенческого №"+st2.StudTick+" Год поступления:"+st2.yearsstudy+" "+st2.srArifm);

        Student st3 = new Student();
        st3.name = "Valeria";
        st3.StudTick = 3;
        st3.surname="Parubova";
        st3.yearsstudy=2023;
        st3.srMath = 3;
        st3.srEconomy=4;
        st3.srLanguage=5;
        st3.srArifm=(st3.srLanguage+st3.srMath+ st3.srEconomy)/3;
        System.out.println(st3.name+st3.surname+" Номер студенческого №"+st3.StudTick+" Год поступления:"+st3.yearsstudy+" "+st3.srArifm);
    }
}