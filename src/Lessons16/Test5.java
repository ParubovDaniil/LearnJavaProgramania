package Lessons16;

public class Test5 {
    public static void main(String[] args) {
        String s = null; // не ссылается ни на какой объект
        s+="ok";
        System.out.println(s);
        //System.out.println(null+true);// или + false так писать нельзя
    }
}
