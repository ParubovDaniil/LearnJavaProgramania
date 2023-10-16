package HomeWork7;

public class Employee {
    public Employee(int id2,String surname2, int age2){
        this(id2,surname2,age2, 0.0,null);
    }
    private Employee(String surname2,int age2){
        this(0,surname2,age2,0.0,null);
    }
     Employee(int id4,String surname4, int age4,double salary4,String department4){
        id = id4;
        surname = surname4;
        age=age4;
        salary=salary4;
        department=department4;
    }
    int id=32;
    public String surname="Elvira";
    int age=32;
    private double salary=22000.00;
    String department="Bank";
    public void viewOne(){
        System.out.println(id+surname+age+salary+department);
    }
    public void viewTwo(){
        System.out.println(id+surname+age+salary+department);
    }
    public void viewThree(){
        System.out.println(id+surname+age+salary+department);
    }
    public static void main(String[] args) {
        Employee empl = new Employee(25,null,44,3.2,null);
        empl.viewOne();
        empl.viewTwo();
        empl.viewThree();
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee empl = new Employee(0,"Daniil",2,0.0,null);
    }
}
