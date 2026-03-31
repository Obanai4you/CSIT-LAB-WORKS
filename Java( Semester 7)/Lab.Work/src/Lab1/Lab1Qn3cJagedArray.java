package Lab1;

import java.util.Scanner;

public class Lab1Qn3cJagedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[3];
        jagged[2] = new int[1];

        System.out.println("Enter elements for jagged array:");
        for (int i = 0; i < jagged.length; i++)
            for (int j = 0; j < jagged[i].length; j++)
                jagged[i][j] = sc.nextInt();

        System.out.println("Jagged array:");
        for (int[] row : jagged) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        // Footer
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");
    }
}