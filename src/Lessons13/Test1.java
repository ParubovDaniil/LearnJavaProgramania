package Lessons13;

public class Test1 {

}





class Student{
    int grade;
    Student(int grade){
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student st1=new Student(6);
        switch (st1.grade){
            case 2:
                System.out.println("student dvoichnik");
                break;
            case 3:
                System.out.println("student troechnik");
                break;
            case 4:
                System.out.println("student xoroshist");
                break;
            case 5:
                System.out.println("student otlichnik");
                break;
            default:
                System.out.println("ocenka ne verna");

        }
        /*if(st1.grade==2){
            System.out.println("Student dvoichnik");
        }
        else if (st1.grade == 3){
            System.out.println("Student troichnik");
        }
        else if (st1.grade == 4){
            System.out.println("Student xoroshist");
        }
        else if (st1.grade == 5){
            System.out.println("Student otlichnik");
        }
        else {
            System.out.println("Ocenka ne verna");
        }*/
    }
}
