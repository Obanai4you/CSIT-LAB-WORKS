
package Lab1;

class GrandParent {
    GrandParent() {
        System.out.println("GrandParent constructor called");
    }
}

class Parent extends GrandParent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor called");
    }
}
public class Lab1Qn7dMultiInheritance {
       public static void main(String[] args) {

        System.out.println("Creating Child object:");
        Child c = new Child(); // Observe constructor call order

        /*
         Output Explanation:
         1. GrandParent constructor is called first
         2. Then Parent constructor
         3. Finally Child constructor
         This shows that constructors are called top-down in multilevel inheritance
        */

        // Footer
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
       }
}
