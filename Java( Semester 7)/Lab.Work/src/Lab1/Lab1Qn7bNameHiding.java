package Lab1;

class Parent2 {
    int x = 10;
}

class Child2 extends Parent2 {
    int x = 20;
    void display() {
        System.out.println("Child x = " + x);
        System.out.println("Parent x = " + super.x);
    }
}

public class Lab1Qn7bNameHiding {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.display();
        
        System.out.println("\nLab1, Priyanshu Shrestha,23081040");
    } 
}
