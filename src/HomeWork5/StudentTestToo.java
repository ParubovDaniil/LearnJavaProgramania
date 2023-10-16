package HomeWork5;

public class StudentTestToo {
    String name;
    int StudTick;
    String surname;
    int yearsstudy;
    double srMath;
    double srEconomy;
    double srLanguage;
    double srArifm;
    double METHOD (double a,double b,double c){
        srArifm=(a+b+c)/3;
        System.out.println(srArifm);
        return srArifm;
    }
}

class StudentTest {

    double sredOcenka(StudentTestToo Kafrjtasdfdsfsdfsdkfops){
        double sredARIFMOCENKA=((Kafrjtasdfdsfsdfsdkfops.srMath+Kafrjtasdfdsfsdfsdkfops.srEconomy+Kafrjtasdfdsfsdfsdkfops.srLanguage)/3);
        System.out.println("Средняя арифметическая оценка студента: ");
        return sredARIFMOCENKA;
    }
    public static void main(String[] args) {

        StudentTestToo st1 = new StudentTestToo();
        st1.name = "Daniil";
        st1.StudTick = 1;
        st1.surname="Parubov";
        st1.yearsstudy=2022;
        st1.srMath = 5;
        st1.srEconomy=5;
        st1.srLanguage=6;
        st1.srArifm=(st1.srLanguage+st1.srMath+ st1.srEconomy)/3;
        System.out.println(st1.name+st1.surname+" Номер студенческого №"+st1.StudTick+" Год поступления:"+st1.yearsstudy+" "+st1.srArifm);
        st1.METHOD(st1.srMath,st1.srEconomy,st1.srLanguage);

        StudentTest sTest = new StudentTest();
        sTest.sredOcenka(st1);


    }

}
