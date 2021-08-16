import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        int[][] rotated = new int[m][n];
        
        inputMatrix(n, m, matrix, rotated);
        printMatrix(n, m, rotated);
    }
    
    public static void inputMatrix(int n, int m, int[][] matrix, int[][] rotated) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input.nextInt();
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
    }

    public static void printMatrix(int n, int m, int[][] rotated) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}
