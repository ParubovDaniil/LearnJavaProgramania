package Lessons5;

public class Test20 {

    int summa(int a,int b,int c){//в скобках параметры
        int result=a+b+c;
        String s = "privet";//Так нельзя потому что метод инт а не стринг
        return result;//всегда последнее в методе
    }
    int sredneeArifm(int a1,int b1, int c1){
        int result2= summa(a1,b1,c1)/3;
        return result2;
    }

}
class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summaTrexChisel =t.summa(1,2,3);
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(5,10,15));//в скобках значения аргументы уже а не параметры
        System.out.println(t.sredneeArifm(20,40,60));
    }
}
