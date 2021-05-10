import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int size = input.nextInt();
        int[] array = new int[size];
        
        inputElements(array);
        selectionSortDescending(array);
        outputElements(array);
        
    }
    
    public static void selectionSortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            
            int index = i; // the index of the found max
            
            for (int k = i + 1; k < array.length; k++) {
                if (array[k] > array[index]) {
                    index = k;
                }
            }
            
            //Exchanging the found max and the current element
            int max = array[index];
            array[index] = array[i];
            array[i] = max;
        }
    }
    
    public static void inputElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
    
    public static void outputElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
