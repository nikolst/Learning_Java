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
            
            int index = i; // the index of the found element
            
            if (index % 2 == 0 || index == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[index]) {
                        index = j;
                    }
                }
            
                //Exchanging the found max and the current element
                int max = array[index];
                array[index] = array[i];
                array[i] = max; 
            } else {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[k] < array[index]) {
                        index = k;
                    }
                }
            
                //Exchanging the found min and the current element
                int min = array[index];
                array[index] = array[i];
                array[i] = min;  
            }
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
