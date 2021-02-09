package planet;

import java.util.Scanner;

public class MatrixBasics {

    public static void main(String[] args) {

        int[][] matrix = new int[20][20];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows/cols: ");
        int n = input.nextInt(); // n is the number of rows/cols


        //input the matrix members
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }


        //print matrix
        System.out.println("The matrix looks like:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        //print the main diagonal
        System.out.println("The matrix main diagonal is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) System.out.print(matrix[i][j] + " ");
            }
        }

        //print the second diagonal
        System.out.println("\nThe matrix second diagonal is:");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - i - 1] + " ");
        }

    }

}
