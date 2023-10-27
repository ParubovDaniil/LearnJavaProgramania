package Lessons19;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array = {sb1,sb2,sb3};
        for(StringBuilder sb:array){
            sb.append("Java");
//            sb = new StringBuilder("hello");
        }
        /*String[] array = {"privet","poka","ok"};
        for(String s:array){
            s=new String("hello");
        }*/
        /*int []array = {0,6,4,1};
        for (int a : array){
            a=3;
        }*/
        /*for(int i=0;i<array.length;i++){
            array[i]=3;
        }*/
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}
