package HomeWork13;

public class Month {
    public static void dayQuantity(int n ){
        switch(n){
            case 2:
            System.out.println("Количество дней в месяце 28");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней в месяце: 30");
                break;
            case 1 :
            case 3 :
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("Количество дней в месяце 31");
            default:
                System.out.println("Месяца с таким порядковым номером не существует");

        }
    }
    public static int numberMonth(int onetotwelve) {
        return onetotwelve;
    }

    public static void main(String[] args) {
        Month.dayQuantity(4);
        switch (numberMonth(6)){
            case 1:
                System.out.println("Январь 31");
                break;
            case 2:
                System.out.println("Февраль 28");
                break;
            case 3:
                System.out.println("Март 31");
                break;
            case 4:
                System.out.println("Апрель 30");
                break;
                case 5:
                System.out.println("Май 31");
                break;
            case 6:
                System.out.println("Июнь 30");
                break;
                case 7:
                System.out.println("Июль 31");
                break;
            case 8:
                System.out.println("Август 30");
                break;
                case 9:
                System.out.println("Сентябрь 30");
                break;
            case 10:
                System.out.println("Октябрь 31");
                break;case 11:
                System.out.println("Ноябрь 30");
                break;
            case 12:
                System.out.println("Декабрь 31");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}