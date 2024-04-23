package Lessons27;

import java.lang.reflect.Array;
import java.io.*;

public class test4 {

    void abc() throws FileNotFoundException {
        File f = new File("test9.txt");
        //try {
        FileInputStream fis = new FileInputStream(f);
        //System.out.println(array[3]);
        //fis.read();
        System.out.println("vsem horoshego dnya");
       /* } catch (FileNotFoundException e) {
            System.out.println("bill poyman exception     :" + e);

        }
    }*/
    }

    void def() {
        System.out.println("privet");
        try {

            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Bill poyman exception    :" + e);
        }
    }

    public static void main(String[] args){
        test4 t = new test4();
        t.def();
/*        int[] array = {4, 8, 1};
        System.out.println("u nas est massiv");*/


        /*finally {
            System.out.println("eto finally block");
        }*/

    }
}

