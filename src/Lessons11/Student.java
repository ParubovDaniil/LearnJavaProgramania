package Lessons11;

public class Student {
    String name;
    int course;
    double grade;
    Student(String name,int course,double grade){
        this.name = name;
        this.course = course;
        this.grade=grade;
    }
    public static void swap (Student s1, Student s2){
        Student s3=s1;
        s1=s2;
        s2=s3;
    }
    public static void changeName(Student s1) {
        s1.name="Vasiliy";

    }
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",2,9.5);
        Student st2 = new Student("Petr",1,5.3);

        changeName(st2);
        System.out.println(st2.name);
    }
}
