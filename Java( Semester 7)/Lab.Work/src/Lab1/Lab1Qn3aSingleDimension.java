
package Lab1;


public class Lab1Qn3aSingleDimension {
      public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = i + 1; // first 15 natural numbers
        }

        int sum = arr[2] + arr[14]; // sum of 3rd and last element
        System.out.println("Sum of 3rd and last element: " + sum);

        // Footer
        System.out.println("\nLab1,Priyanshu Shrestha,23081040");

    }
}
