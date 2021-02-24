import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[10][10];
        //input the number of rows/cols
        int n = input.nextInt();
        
        //input the matrix`s elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();     
            }
        }
        
        //check if the elements are symetric and increse the counter if true
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && matrix[i][j] == matrix[j][i]) {
                    count++;
                }
            }
        }
        
        //
        if (count == n * n - n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        //print the matrix *** not required in this task
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");  
            }
            System.out.println();
        }*/
    }
}
