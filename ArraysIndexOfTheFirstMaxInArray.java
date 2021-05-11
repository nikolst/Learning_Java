import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
        int max = array[0];
        int index = 0;
        
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j;
            }
        }
        System.out.println(index);
    }
}
