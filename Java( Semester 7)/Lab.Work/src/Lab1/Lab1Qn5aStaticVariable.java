
package Lab1;

class StaticVarDemo {
    static int count = 0;
    void increment() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class Lab1Qn5aStaticVariable {
      public static void main(String[] args) {
        StaticVarDemo obj1 = new StaticVarDemo();
        StaticVarDemo obj2 = new StaticVarDemo();

        obj1.increment();
        obj2.increment();

        // Footer
System.out.println("\nLab1, Priyanshu Shrestha,23081040");
    }
    
}
