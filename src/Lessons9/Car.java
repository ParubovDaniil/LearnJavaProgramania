package Lessons9;

public class Car {
    int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 5;
    int sad =5;
    String color;
    String engine;
    static int count;
    Car(String color2, String engine2){
        count++;
        color = color2;
        engine = engine2;
    }
/*    public void showColor(){
        System.out.println("Цвет машины: "+ color);
        this.changeColor("red");
    }
    public void changeColor(String color3){
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        color = color3;
        cena +=1000;
    }*/
/*    void abc(int a, int b){
    boolean c = true;
    }
    void abcd(int a,int b){

    }*/
    void changeColor(String color){
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car c= new Car("red","V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);
    }
}
