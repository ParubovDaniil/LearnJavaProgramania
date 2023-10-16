package Lessons6;

public class Employee {
    Employee(int id2,String surname2, int age2){
        this(id2,surname2,age2, 0.0,null);
    }
    Employee(String surname2,int age2){
        this(0,surname2,age2,0.0,null);
    }
    Employee(int id4,String surname4, int age4,double salary4,String department4){
        id = id4;
        surname = surname4;
        age=age4;
        salary=salary4;
        department=department4;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}
class EmployeeTest{
    public static void main(String[] args) {
    Employee emp = new Employee(1,"Иванов",24);
    System.out.println(emp.surname);
    Employee emp2 = new Employee("Petrov",30);
    System.out.println(emp2.department);
}
}