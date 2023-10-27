package HomeWork18;

public class HomeWorkTwo {
    public static String[][] showArray(String[][] parameter) {
        for (int i = 0; i < parameter.length; i++) {
            for (int j = 0; j < parameter[i].length; j++) {
                System.out.print(parameter[i][j]);
            }
        }
        return parameter;
    }

    public static void main(String[] args) {
        String[][] parameter;
        parameter = new String[][]{{"элемент00 ", "элемент01 "}, {"элемент10 "}, {"элемент10 ", "элемент11 "}};
        showArray(parameter);
    }
}
