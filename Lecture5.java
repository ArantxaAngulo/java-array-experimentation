package def;

import java.util.Arrays;

// Arrays are of a single type and cannot be altered. They remain consistent.
// When an array is created, a block of memory is reserved (1 int = 32 bits).

public class Lecture5 {
    public static void main(String[] args) {
        // There are different stages for working with arrays:
        // 1. DECLARATION
            // One-dimensional arrays
            int iArray[];
            byte bArray[];
            String[] strArray;

            // Two-dimensional arrays (matrices)
            int iMatrix[][];
            double dMatrix[][];
            // Arrays can have N dimensions

        // 2. CREATION
            iArray = new int[5];
            int N = 4;
            bArray = new byte[N]; // Specifies the size of the array
            
            iMatrix = new int[3][2]; // 3 rows and 2 columns

            // Irregular matrix (2D array with variable column sizes)
            // It could be automated if the number of columns is known
            dMatrix = new double[4][];
            dMatrix[0] = new double[2];
            dMatrix[1] = new double[5];
            dMatrix[2] = new double[3];
            dMatrix[3] = new double[7];

        // 3. INITIALIZATION
            iArray = new int[] {1, 2, 3, 4, 5}; // Initialization with specific values

            // Initializing specific positions in the byte array
            bArray[0] = 34;
            bArray[3] = 98;
            bArray[1] = 100;
            bArray[2] = 127;

            // Filling the irregular matrix with random values
            for (int f = 0; f < dMatrix.length; f++) {
                for (int c = 0; c < dMatrix[f].length; c++) {
                    dMatrix[f][c] = Math.random();
                }
            }

        // 4. DECLARATION, CREATION, AND INITIALIZATION
            int[] iArray2 = {10, 9, 8, 7, 6}; // All in one step
            
            // Initialization of a 2D matrix
            iMatrix = new int[][] 
                       {{1, 2},
                        {3, 4},
                        {5, 6},
                        {7, 8}};
            
            // Initializing a string array
            strArray = new String[] {"this", "is", "an", "array", "of", "strings"};
            for (String s : strArray) {
                System.out.println(s);
            }
            System.out.println();

        // Array manipulation
            // Iterating using a for loop
            for (int i = 0; i < iArray.length; i++) {
                System.out.print(iArray[i] + " ");
            }
            System.out.println();
            System.out.println("=====");
            
            // Iterating using a for-each loop (only works directly with 1D arrays)
            for (int f : iArray) {
                System.out.print(f + " ");
            }
            System.out.println();
            System.out.println("=====");
            
            // Nested for-each loop for 2D arrays
            for (int[] row : iMatrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println("=====");

        // Cloning arrays
            int[] iArray2Clone = iArray2.clone();
            for (int i : iArray2) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i : iArray2Clone) {
                System.out.print(i + " ");
            }
            
            // Comparing arrays
            System.out.println("\nThe arrays are " + (iArray2 == iArray2Clone ? "equal" : "different")); // "Different" because they point to DIFFERENT memory locations
            System.out.println("The arrays are " + (iArray2.equals(iArray2Clone) ? "equal" : "different")); // "Different" because they point to DIFFERENT memory locations
            
            // Proper array content comparison
            System.out.println("The arrays are " + (Arrays.equals(iArray2, iArray2Clone) ? "equal" : "different")); 
    }
}
