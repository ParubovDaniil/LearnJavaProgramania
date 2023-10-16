package HomeWork11;

public class Car {
    public int doorCount;
    String color;
    String engine;
   public Car(String color1,String engine1,int doorCount1){
        this.color=color1;
        this.engine=engine1;
        this.doorCount=doorCount1;
    }
}
class CarTest{
    public void changeDoorCount(Car c,int doorCount) {
        c.doorCount=doorCount;
    }
    void changeColor(Car c1,Car c2){
        String color = c1.color;
        c1.color=c2.color;
        c2.color=color;
    }
    public static void main(String[] args) {
    CarTest ct = new CarTest();
    Car car1 = new Car("red","v4",2);
    Car car2 = new Car("yellow","V6",4);
    ct.changeDoorCount(car1,3);
    ct.changeColor(car1,car2);
        System.out.println("Информация о первой машине: Цвет: "+ car1.color + " Мотор: " + car1.engine + " Количество дверей: "+ car1.doorCount);
        System.out.println("Информация о второй машине: Цвет: "+ car2.color + " Мотор: " + car2.engine + " Количество дверей: "+ car2.doorCount);

    }

}
