package Lessons8;

public class Student {
    String name;
    int course;
    static int count;
    int a;
    public Student(String name2,int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # "+ count+" sozdan");
    }
    public static void showCount(){
        System.out.println("Vsego sozdano "+ count);
    }
    public void showInfo() {
        System.out.println("Welcome to the Student class!!");
    }
    void abc(){
        a++;
        count++;
    }
    static void abcd(){
        count++;
        Student st2 =new Student("Petr",1);
        st2.a++;
    }
    public static void main(String[] args) {//Запускается когда никаких объектов не существует
    abcd();
    Student st3 = new Student("Dan",4);
    st3.abc();

    }
}
