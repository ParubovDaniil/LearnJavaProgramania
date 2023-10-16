package HomeWork8;

public class Task2 {
    final static double P = 3.14;
    double ploshadbCircle(double radius){
        double pl = P*radius*radius;
        return pl;
    }
    static double lineCircle(double radius2){
        double dl = 2*P*radius2;
        return dl;
    }
    public void Info(double radius3){
        System.out.println("Радиус = "+ radius3);
        System.out.println("Площадь круга = "+ ploshadbCircle(radius3));
        System.out.println("Длина окружности = ="+ lineCircle(radius3));
    }
}
class Task02{
    public static void main(String[] args) {
        Task2 tsk = new Task2();
        tsk.ploshadbCircle(5);
        Task2.lineCircle(7.5);
        tsk.Info(3);
    }
}
