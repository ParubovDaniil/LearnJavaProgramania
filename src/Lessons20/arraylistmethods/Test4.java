package Lessons20.arraylistmethods;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mihail");
        map.put(778, "Daniil Parubov");
        map.put(779, "Maria Sidorova");
        map.put(780, "Maria Sidorova");
        map.remove(779);
        System.out.println("map = " + map);
    }
}
