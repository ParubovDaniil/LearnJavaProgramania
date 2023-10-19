package HomeWork14;

public class HomeWork {
    public static void timeFormate() {

        OUTER:
        for (int h = 0; h <= 23; h++) {

            INNER:
            for (int m = 0; m <= 59; m++) {

                INNERINNER:
                for (int s = 0; s <= 59; s++) {
                    if (s*h>m){
                        continue;
                    }
                    if (h>1){
                        break OUTER;
                    }
                    if (m == 10) {
                        break OUTER;
                    }
                    if (h == 6 && m == 0 && s == 1) {
                        break OUTER;
                    }
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }
    }

    public static void main(String[] args) {
        HomeWork.timeFormate();
    }
}
