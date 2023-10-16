package HomeWork6;

public class Student {
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
    Student(){
        this(null,0,null,0,0.0,0.0,0.0);
    }
    Student(String name1,int StudTick1,String surname1,int yearsstudy1){
        this(name1,StudTick1,null,yearsstudy1,0.0,0.0,0.0);
    }
    Student(String name1,int StudTick1,String surname1,int yearsstudy1,double srMath1,double srEconomy1,double srLanguage1){
        name=name1;
        StudTick=StudTick1;
        surname=surname1;
        yearsstudy=yearsstudy1;
        srMath=srMath1;
        srEconomy=srEconomy1;
        srLanguage=srLanguage1;
    }
    }
class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student(null, 0, null, 0, 1, 3, 2);
        Student st2 = new Student("Daniilm", 1, "Parubov", 2022, 4, 5, 2);
        Student st3 = new Student("Elvira", 2, "Sibgatullina", 2023, 5, 5, 5);
        System.out.println(st1.name+" "+st1.yearsstudy+" "+st1.surname+" "+st1.srMath+" "+st1.srEconomy+" "+st1.srLanguage);
        st1.METHOD(st1.srMath,st1.srEconomy,st1.srLanguage);
        System.out.println(st1.name+" "+st1.yearsstudy+" "+st1.surname+" "+st1.srArifm);

    }
}

