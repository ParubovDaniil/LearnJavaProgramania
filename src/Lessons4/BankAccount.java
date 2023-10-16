package Lessons4;

public class BankAccount {
    int id=10;
    String name="Petr";
    double balance=100;

}
class BankAccountTest{
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();//bA содержит в себе адрес с помощью которого можем найти объект который создали
        BankAccount YourAccount = new BankAccount();//когда создаётся конструктор в памяти создаётся шаблон класса банкаккаунт с его переменными
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Daniil";
        MyAccount.balance=12.35;
        YourAccount.id=2;
        YourAccount.name="Elvira";
        YourAccount.balance=100.25;
        HisAccount.id=3;
        HisAccount.name="Lera";
        HisAccount.balance=14.578;

        System.out.println(MyAccount.id);
    }
}
