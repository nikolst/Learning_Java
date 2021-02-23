import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input rows and cols
        int n = input.nextInt();
        int m = input.nextInt();
        //initialize multi-dimensional array
        int[][] mArr = new int[100][100];
        
        //input multi-dimensional array elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mArr[i][j] = input.nextInt();
            }
        }
        
        // input columns to swap
        int j1 = input.nextInt();
        int j2 = input.nextInt();
        int swap;
        
        //swap the columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == j1) {
                    swap = mArr[i][j];
                    mArr[i][j] = mArr[i][j2];
                    mArr[i][j2] = swap;
                }
            }
        }
        
        //print the multi-dimensional array with the swapt columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
