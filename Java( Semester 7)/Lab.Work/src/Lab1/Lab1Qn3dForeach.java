package Lab1;

public class Lab1Qn3dForeach {
      public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++)
            arr[i] = i + 1; // first 15 natural numbers

        System.out.println("Displaying array using for-each loop:");
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();

        // Footer
     System.out.println("\nLab1,Priyanshu Shrestha,23081040");
    }
}