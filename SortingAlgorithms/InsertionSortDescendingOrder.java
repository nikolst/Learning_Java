package planet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] array = new int[len];

        //input elements into the array
        for (int m = 0; m < len; m++) {
            array[m] = input.nextInt();
        }

        //sort the elements in descending order
        for (int i = 1; i < len; i++) {
            int element = array[i];
            int j = i;

            while (j > 0 && array[j - 1] < element) {
                array[j] = array[j - 1];
                j--;
            }

            array[j] = element;
        }

        //output the sorted array
        for (int m = 0; m < len; m++) {
            System.out.print(array[m] + " ");
        }
    }
}
