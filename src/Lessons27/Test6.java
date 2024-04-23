package Lessons27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (NullPointerException e) {
            System.out.println("poyman exception 2");
        } catch (FileNotFoundException e) {
            System.out.println("poymane exception 1");
        } catch (IOException e) {
            System.out.println("poyman exception 3");
        } catch (RuntimeException e) {
            System.out.println("poyman exception 4");
        } catch (Exception e) {
            System.out.println("poyman exception 5");
        } catch (Throwable e) {
            System.out.println("poyman exception 6");
        }
    }
}

// первые чайлд классы, последующие родители
