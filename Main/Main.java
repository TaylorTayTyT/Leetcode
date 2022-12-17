package Main;
import Main.Dog;
public class Main {

    public static void change(Dog a) {
        a.age = 4;
    }
    public static void main(String[] args) {
        System.out.println("hi");
        Dog a = new Dog(8);
        System.out.println("age: " + a.age);
        change(a);
        System.out.println("ageNew: " + a.age);
    }
}
