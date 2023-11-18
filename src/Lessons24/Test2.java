package Lessons24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();//Создал объект не абстрактного класса
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }

}

//final и abstract противоположные
abstract class Figura { //Категоризация
    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Это фигура");
    }
}

//Подкатегории
//Класс который перезаписывает методы абстрактного называется конкретным
class Kvadrat extends Figura {

    int kolichestvoStoron = 4;
    int storona1 = 10;

    @Override
    public void perimetr() {
        System.out.println("Периметр квадрата = " + 4 * storona1);
    }

    @Override
    void ploshad() {
        System.out.println("Площадь квадрата = " + storona1 * storona1);
    }
}

class XXX extends Kvadrat {
}//

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    @Override
    public void perimetr() {
        System.out.println("Периметр прямоугольника = " + 2 * (storona1 + storona2));
    }

    @Override
    void ploshad() {
        System.out.println("Площадь прямоугольника = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;

    @Override
    public void perimetr() {
        System.out.println("Периметр окружности = " + 2 * 3.14 * radius);
    }

    @Override
    void ploshad() {
        System.out.println("Площадь окружности = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura {
    void def() {
        System.out.println("Это четырёхугольник");
    }
}
