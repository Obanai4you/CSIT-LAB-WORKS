
package Lab1;

class MethodOverload {
    void display() {
        System.out.println("No arguments");
    }

    void display(int x) {
        System.out.println("One argument: " + x);
    }

    void display(int x, int y) {
        System.out.println("Two arguments: " + x + ", " + y);
    }
}

public class Lab1Qn4aOverloading {
     public static void main(String[] args) {
        MethodOverload mo = new MethodOverload();

        mo.display();
        mo.display(10);
        mo.display(20, 30);
   
          // Footer
     System.out.println("\nLab1,Priyanshu Shrestha,23081040");
    }
}