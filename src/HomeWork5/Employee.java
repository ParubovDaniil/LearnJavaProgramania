package HomeWork5;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String department;
    Employee(int id1,String name1,int age1,double salary1,String department1){
        id=id1;
        name=name1;
        age=age1;
        salary=salary1;
        department=department1;
    }
    double doubleXsalary(double x2){
    salary*=x2;
    return salary;
    }
    void infoView(){
        System.out.println(" Сотрудник с табельным номером: "+id+" Имя: "+name+" Возраст: "+age+"\n Заработная плата до повышения: " +
                salary + "Работает в департаменте^ "+department);
    }
    void infoViewToo(){
        System.out.println(" Сотрудник с табельным номером: "+id+" Имя: "+name+" Возраст: "+age+"\n Заработная плата после повышения: " +
                salary + "Работает в департаменте^ "+department);
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Daniil", 23, 46000, "Manager");
        Employee emp2 = new Employee(2, "Elvira", 22, 40000, "Admisitrator");

        emp1.infoView();
        emp2.infoView();

        emp1.doubleXsalary(2);
        emp2.doubleXsalary(2);

        emp1.infoViewToo();
        emp2.infoViewToo();
    }
}

