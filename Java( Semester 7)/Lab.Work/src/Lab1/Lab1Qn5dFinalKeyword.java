
package Lab1;

final class FinalClass {
    final int MAX = 100;

    final void display() {
        System.out.println("Final method called. MAX=" + MAX);
    }
}
public class Lab1Qn5dFinalKeyword {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
        
        // Footer
        System.out.println("\nLab1, Priyanshu Shrestha,23081040");
    }
}
