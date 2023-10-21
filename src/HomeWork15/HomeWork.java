package HomeWork15;
public class HomeWork {
    static void vremya() {
        int chas = 0;
        OUTER:
        while (chas <= 6) {
            int minuta = 0;
            MIDDLE:
            do {
                int secunda = 0;
                INNER:
                while (secunda < 60) {
                    /*if (chas == 6 && minuta == 0 && secunda == 0) { До 6:00:00 вместе
                        break OUTER;
                    }*/
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                    secunda++;
                    if (secunda * chas > minuta) {
                        break INNER;
                    }
                    /*if (secunda * chas > minuta) {
                        continue MIDDLE;
                    }*/
                    /*if (chas == 6) { До 6:00:00 по отдельности
                        break INNER;
                    }*/
                }
                minuta++;
                if (chas >= 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                /*if (chas == 6) {  До 6:00:00 по отдельности
                    break MIDDLE;
                }*/
            }
            while (minuta < 60);
            chas++;
        }
    }
    public static void main(String[] args) {
        vremya();
    }
}

