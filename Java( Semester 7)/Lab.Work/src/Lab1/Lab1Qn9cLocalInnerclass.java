package Lab1;
import java.util.Scanner;

class OuterLocal {
    void localInnerDemo(String name) {
        class LocalInner {
            void print() {
                System.out.println("Local Inner Class Name: " + name);
            }
        }
        LocalInner li = new LocalInner();
        li.print();
    }
}

public class Lab1Qn9cLocalInnerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name for Local Inner Class: ");
        String name = sc.nextLine();

        OuterLocal outer = new OuterLocal();
        outer.localInnerDemo(name);
        
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
        sc.close();
    }
}
