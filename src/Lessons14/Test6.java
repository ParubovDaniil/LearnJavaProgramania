package Lessons14;

public class Test6 {
    public void time() {

        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Начало внешнего цикла");

            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (minuta == 20) {
                    continue OUTER;

                }
                System.out.println(hour + " : " + minuta);

            }
            System.out.println("Конец внешнего цикла");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
