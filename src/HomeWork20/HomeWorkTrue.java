package HomeWork20;
import java.util.*;
public class HomeWorkTrue {
    public ArrayList<String> abc(String...s){
        ArrayList<String> aL = new ArrayList<>();
        for(String s1:s){
            if(!aL.contains(s1)){
                aL.add(s1);
            }
        }
        Collections.sort(aL);
        System.out.println(aL);
        return aL;
    }

    public static void main(String[] args) {
        HomeWorkTrue H20 = new HomeWorkTrue();
        H20.abc("privet","ok","poka","privet","kak dela?","ok","hello");
    }
}
