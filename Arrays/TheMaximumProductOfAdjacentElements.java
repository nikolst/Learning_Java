import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        
        inputElements(arraySize, array);
        System.out.println(findMaxProduct(arraySize, array));
    }
    
    public static void inputElements(int arraySize, int[] array) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = input.nextInt();
        }
    }
    
    public static int findMaxProduct(int arraySize, int[] array) {
        int maxProduct = array[0] * array[1];
        for (int i = 0; i < arraySize - 1; i++) {
            if (array[i] * array[i + 1] > maxProduct) {
                maxProduct = array[i] * array[i + 1];
            }
        }
        return maxProduct;
    }
}
