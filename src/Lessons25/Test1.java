package Lessons25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee [] array2 = {emp1,emp2,emp3};
        /*for(Employee emp :array2){
            emp.work();
        }*/
        System.out.println();
/*        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Driver(), new Driver(),new Teacher(),new Doctor()};
        Help_able [] array3 = {new Driver(), new Driver(),new Teacher(),new Doctor()};*/


        //Help_able h = new Teacher();
        emp1.work();
        emp2.work();
        emp3.work();
        //h.help();
        /*emp1.work();
        emp2.work();
        emp3.work();*///В зависимости от объекта который вызывает метод он работает по разному это и есть полиморфизм

    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able{

    @Override
    void work() {
        System.out.println("Teachers works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements Help_able{
    @Override
    public void work() {
        System.out.println("Driver works");
    }


    public void help() {
        System.out.println("Driver helps");

    }
}

class Doctor extends Employee implements Help_able{
    @Override
    void work() {
        System.out.println("Doctor works");
    }

    public void help() {
        System.out.println("Doctor helps");

    }
}
interface Help_able{
    void help();
}
