import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int size = input.nextInt();
        int[] array = new int[size];
        
        inputElements(array);
        int k = input.nextInt();
        sortElements(array, k);
        outputElements(array, k);
    }
    
    public static void inputElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.next());;
        }
    }
    
    public static void sortElements(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            int index = i; // the index of the found max
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
            }
            
        //Exchanging the found max and the current element 
            int max = array[index];
            array[index] = array[i];
            array[i] = max;
        }
    }
    
    public static void outputElements(int[] array, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
