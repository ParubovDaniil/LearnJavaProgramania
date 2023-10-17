package Lessons13;

public class Employee {
    public static void main(String[] args) {
        switch ("Понедельник"){
            case "Понедельник" :
            case "Вторник" :
            case "Среда" :
            case "Четверг" :
            case "Пятница" :
                System.out.println("Работа до 18");
                break;
            case "Суббота" :
                System.out.println("Работа до 14");
                break;
            case "Воскресенье" :
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Такого дня не существует");

        }
    }
}
