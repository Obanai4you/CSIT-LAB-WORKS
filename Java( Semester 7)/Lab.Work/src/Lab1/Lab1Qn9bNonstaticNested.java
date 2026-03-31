package Lab1;

import java.util.Scanner;

class Outer {
    class Inner {
        void show(int number) {
            System.out.println("Inner Class received number: " + number);
        }
    }
}

public class Lab1Qn9bNonstaticNested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Inner Class: ");
        int num = sc.nextInt();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show(num);
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
        sc.close();
    }
    
}
