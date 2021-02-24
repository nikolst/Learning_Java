import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[100][100];
        
        //input rows and cols length
        int n = input.nextInt();
        int m = input.nextInt();
        
        //input the double array elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        
        //check which is the max element and save its indexes
        int max = arr[0][0];
        int maxi = 0; //saves the i-index of the max element
        int maxj = 0; //saves the j-index of the max element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        //print the result
        System.out.println(maxi + " " + maxj);
    }
}
