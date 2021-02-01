package planet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        n = input.nextInt();

        int arr[] = new int[10];

        //въвеждаме елементи в масива
        System.out.println("Input the array elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        //извеждаме елементите на масива
        System.out.print("The array elements are: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
