package HomeWork5;
public class BankAccountToo {
    int id;
    String name;
    double balance;
    double popolnenie(double plus){
        balance += plus;
        return balance;
    }
    void viewInfo(){
        System.out.println(id+name+balance);
    }
    double snyatie(double min){
        balance -=min;
        return balance;
    }
}
class BankAccountTooTest{
    public static void main(String[] args) {
        BankAccountToo MyAccount = new BankAccountToo();
        MyAccount.id=1;
        MyAccount.name="Daniil";
        MyAccount.balance=100;
        System.out.println(MyAccount.id+" "+MyAccount.name+" "+MyAccount.balance);
        MyAccount.popolnenie(125);
        System.out.println(MyAccount.id+" "+MyAccount.name+" "+MyAccount.balance);
        MyAccount.viewInfo();
        MyAccount.snyatie(125);
        System.out.println(MyAccount.id+" "+MyAccount.name+" "+MyAccount.balance);
        MyAccount.viewInfo();

    }
}
