package Lessons20;

import java.util.Arrays;

//compare сравнивать
//mismatch несоответствие
public class Test8 {
    public static void main(String[] args) {
        int []array1 = {1,2,3,4,5};
        int[]array2={1,2,3,5};
        int[]array5={1,2,3,5};

        char[]array3 = {'p','r','i','v','e','t'};
        char[]array6 = {'p','r','i','v','e','t','o'};
        char[]array4 = {'p','r','i','v','i','v','k','a'};
        char[]array7 = null;
        char[]array8 = null;
        System.out.println(Arrays.compare(array2,array5));//когда 1ый массив больше 2ого то выводится меньше 0
        System.out.println(Arrays.compare(array3,array4));//когда 1ый массив больше 2ого то выводится меньше 0
        System.out.println(Arrays.mismatch(array2,array5));//когда 1ый массив больше 2ого то выводится меньше 0
        System.out.println(Arrays.mismatch(array3,array4));//когда 1ый массив больше 2ого то выводится меньше 0

    }
}

//привет
//прививка

//12345
//1235
