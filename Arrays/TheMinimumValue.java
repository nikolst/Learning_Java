import java.util.Scanner;

class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        arrayInput(arraySize, array);
        findMin(arraySize, array);
    }
    
    public static void arrayInput(int arraySize, int[] array) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = input.nextInt();
        }
    }
    
    public static void findMin(int arraySize, int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println(min);
    }
}
