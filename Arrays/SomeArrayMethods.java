package planet;

import java.util.Scanner;

public class ArraySearch {

    static void printArray(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    static void printMaxElement(int[] arr, int n)
    {
        int max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("\nThe biggest element is " + max);
    }

    static void serchElement(int[] arr, int n)
    {
        int searchFor = 16;
        boolean contains = false;
        for(int i  = 0; i < n; i++)
        {
            if(arr[i] == searchFor) contains = true;
        }

        if(contains)
        {
            System.out.println(searchFor + " - the element we are searching for is in the array.");
        } else {
            System.out.println(searchFor + " - the is no such element in the array!");
        }
    }

    static void bubbleSort(int[] arr, int n)
    {
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    static void changeElement(int[] arr, int n)
    {
        int elementToChange = 7;
        int newElement = 10;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == elementToChange) arr[i] = newElement;
        }
    }

    static void removeElement(int[] arr, int n)
    {
        int[] copyArray = new int[n - 1];
        int index = 3;
        for(int i = 0, j = 0; i < n; i++)
        {
            if(i != index)
            {
                copyArray[j++] = arr[i];
            }
        }

        for(int k = 0; k < copyArray.length; k++)
        {
            System.out.print(copyArray[k] + " ");
        }
    }


    public static void main(String[] args) {

        int[] arr = new int[20];
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = input.nextInt();

        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        printArray(arr, n);
        printMaxElement(arr, n);
        serchElement(arr, n);
        bubbleSort(arr, n);
        System.out.println();
        changeElement(arr, n);
        printArray(arr, n);
        System.out.println();
        removeElement(arr, n);
    }
}
