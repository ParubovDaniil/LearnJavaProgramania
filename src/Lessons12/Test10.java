package Lessons12;

public class Test10 {
    public static void main(String[] args) {
        int salary = 100;
        boolean b = true;

        if (salary<200){
            System.out.println("Z/P низкая");
        }
        else if (salary<400 && b==false || !true) {
            System.out.println("Z/P средняя");
        }
        else if (b==true){
            System.out.println("Z/P высокая");
        }
/*        else {
            System.out.println("Z/P отличная");
        }*/
/*        int salary = 500;
        if (salary>=500) // сам по себе существует без else
            System.out.println("^_^");
        else // сам по себе не работает без if
            System.out.println("=(");
            System.out.println("Все будет хорошо");*/






    }
}
