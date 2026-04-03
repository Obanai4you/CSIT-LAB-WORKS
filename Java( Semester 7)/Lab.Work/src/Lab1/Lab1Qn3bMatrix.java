
package Lab1;

import java.util.Scanner;
public class Lab1Qn3bMatrix {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix elements:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("Diagonal elements:");
        for (int i = 0; i < 3; i++)
            System.out.println(matrix[i][i]);

        // Footer
        System.out.println("\nLab1,Priyanshu Shrestha, 23081040");
    }
}
    
    
