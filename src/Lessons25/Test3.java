package Lessons25;




public class Test3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Help_able h = new Doctor();
        Employee emp = new Doctor();
        System.out.println(e==emp);
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        System.out.println(e==emp2);
        System.out.println(h==emp);
        Test3 t = new Test3();
        //System.out.println(e==t);
        System.out.println(e.equals(t));
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        Employee [] array = {emp1,emp2,emp3};
        for(Employee es:array){
            if(e instanceof Driver){
                System.out.println(((Driver) e).nazvanieMashini);
                ((Driver) e).vodit();
            }
        }
        Doctor d1 = (Doctor)emp1;//Используем кастинг
        System.out.println(d1.specializaciya);
        System.out.println(((Doctor) emp1).specializaciya);
       // System.out.println(((Doctor) emp2).specializaciya);//Могу обмануть компилятор но Run Time не обмануть в данном случае
        h.help();
        System.out.println(((Doctor)h).specializaciya);
        ((Doctor)h).health();//Потому что есть IS-A релейшншип
        d1.health();
        ((Doctor)emp).help();
        //((Doctor)emp2).health();//Downcasting
    }
}
class Employee  {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Doctor extends Employee implements Help_able{
    String specializaciya="xirurg";
    public void help(){
        System.out.println("Doctor okazivaet pomosh");
    }
    void health() {
        System.out.println("Health");
    }
}

class Teacher extends Employee{
    int kolichestvoUchenikov;
    void uchit(){
        System.out.println("Uchit");
    }
}
class Driver extends Employee{
    String nazvanieMashini;
    void vodit(){
        System.out.println("Vodit");
    }
}
interface Help_able{
    void help();
}
