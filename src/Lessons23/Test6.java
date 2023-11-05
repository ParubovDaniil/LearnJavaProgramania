package Lessons23;

public class Test6 {

}
class Animal{
     String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of Animal: "+ showName());
    }
}
class Mouse extends Animal{
     String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of Mouse: "+ showName());
    }
    public static void main(String[] args) {
        Mouse a = new Mouse();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}
