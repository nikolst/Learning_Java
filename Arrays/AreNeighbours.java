import java.util.Scanner;

class Main {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        
        inputArrayElements(array);
        
        int n = input.nextInt();
        int m = input.nextInt();
        
        System.out.println(areNeighbours(array, n, m));
    }
    
    public static void inputArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
    
    public static boolean areNeighbours(int[] array, int n, int m) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m || array[i] == m && array[i + 1] == n) {
                return false;
            }
        }
        return true;
    }
}
