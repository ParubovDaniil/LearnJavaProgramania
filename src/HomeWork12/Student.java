package HomeWork12;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}
class StudentTest{
    void firstMethod(String s1,String s2){
        String s0 = s1;
        String s3 = s2;
        if(s0.equals(s3)) {
            System.out.println("Их именна равны");}

        else{
                System.out.println("ИХ имена не равны");
            }

        }
    void secondMethod(String s1,String s2,int course1,int course2,double grade1,double grade2 ){
        String s0 = s1;
        String s3 = s2;
        if(s0.equals(s3) && course1==course2 && grade1==grade2){
            System.out.println("Студентов зовут одинаково, учатся они на одном курсе и получают одинаковые оценки");
        }
        else {
            System.out.println("Студенты не равны и учатся на разных курсах и получают разные оценки");
        }

        }
        void thirdMethod(String s1,String s2,int course1,int course2,double grade1,double grade2) {
            String s0 = s1;
            String s3 = s2;
            if (s0.equals(s3)) {
                if (course1 == course2) {
                    if (grade1==grade2){
                        System.out.println("Студент один человек");
                    }
                    else {
                        System.out.println(" У студентов одинаковое имя и курс");
                    }
                }
                else {
                    System.out.println("У студентов одинаковое только имя");
                }
            }
            else {
                System.out.println("У студентов нет одинаковых параметров");
            }

        }
        public static void method1(Student st1,Student st2){
        if(st1.name.equals(st2.name)&& st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
        }
        public static void method2(Student st1,Student st2){
        if(st1.name.equals((st2.name))){
            if(st1.course==st2.course){
                if (st1.grade==st2.grade){
                    System.out.println("Имена студентов, курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки различаются");
                }
            } else {
                System.out.println("Имена студентов одинаковы, но курсы различаются");
        }
        }else {
                System.out.println("Имена студентов различаются");
            }
        }
            public static void main(String[] args) {
                StudentTest stt = new StudentTest();
                Student st1 = new Student("Daniil", 2, 4.8);
                Student st2 = new Student("Valeria", 1, 5);
                Student st3 = new Student("Daniil", 2, 4.8);
                stt.firstMethod(st1.name, st2.name);
                stt.secondMethod(st1.name, st2.name, st1.course, st2.course, st1.grade, st2.grade);
                stt.firstMethod(st1.name, st3.name);
                stt.secondMethod(st1.name, st3.name, st1.course, st3.course, st1.grade, st3.grade);

                stt.thirdMethod(st1.name, st3.name, st1.course, st3.course, st1.grade, st2.grade);


            }
        }

