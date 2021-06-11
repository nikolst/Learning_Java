import java.util.Scanner;

class Main {
    public static void shift(int[] a, int[] arr, int size) {
        //1-st way using arraycopy:
        System.arraycopy(a, 0, arr, 1, size - 1);

        //2-nd way using for loop:
        //for (int k = 1; k < size; k++) {
        //  arr[k] = a[k - 1];
        //}
    }

    public static void outputElements(int[] arr, int size) {
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();
        }

        //create arr to save the final result
        int[] arr = new int[size];
        arr[0] = a[size - 1];
        
        shift(a, arr, size);
        outputElements(arr, size);
    }
}
