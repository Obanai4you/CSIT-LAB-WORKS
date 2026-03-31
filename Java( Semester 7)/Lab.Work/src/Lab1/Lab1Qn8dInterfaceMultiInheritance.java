package Lab1;

// Interface 1
interface Engine {
    void startEngine();
}

// Interface 2
interface Horn {
    void blowHorn();
}

// Class implementing multiple interfaces
class Car implements Engine, Horn {

    @Override
    public void startEngine() {
        System.out.println("Engine started!");
    }

    @Override
    public void blowHorn() {
        System.out.println("Horn is blowing!");
    }
}

// Main class
public class Lab1Qn8dInterfaceMultiInheritance {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.startEngine();
        myCar.blowHorn();

        System.out.println("\nLab1, Priyanshu Shrestha, 23081040");
    }
}