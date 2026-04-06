package Lab1;

// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Class implementing multiple interfaces
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }
}

// Main class
public class Lab1Qn8dInterfaceMultiInheritance {
    public static void main(String[] args) {

        Duck d = new Duck();

        d.fly();
        d.swim();

         System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}