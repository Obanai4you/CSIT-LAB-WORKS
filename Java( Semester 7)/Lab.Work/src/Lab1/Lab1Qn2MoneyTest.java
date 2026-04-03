package Lab1;

import java.util.Scanner;

class Money {
    int rupee, paisa;

    void setMoney(Scanner sc) {
        System.out.print("Enter rupees: ");
        rupee = sc.nextInt();
        System.out.print("Enter paisa: ");
        paisa = sc.nextInt();
    }

    void displayMoney() {
        System.out.print(rupee + " Rupee, " + paisa + " Paisa");
    }

    void addMoney(Money m1, Money m2) {
        int totalPaisa = m1.paisa + m2.paisa;
        rupee = m1.rupee + m2.rupee + (totalPaisa / 100);
        paisa = totalPaisa % 100;
    }
}

public class Lab1Qn2MoneyTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Money m1 = new Money();
        Money m2 = new Money();
        Money m3 = new Money();

        System.out.println("Enter Money 1:");
        m1.setMoney(sc);

        System.out.println("Enter Money 2:");
        m2.setMoney(sc);

        m3.addMoney(m1, m2);

        System.out.print("\nResult:\n");
        m1.displayMoney();
        System.out.print(" + ");
        m2.displayMoney();
        System.out.print(" = ");
        m3.displayMoney();

        // Footer
        System.out.println("\n\nLab1, Priyanshu, 23081040");

        sc.close();
    }
}