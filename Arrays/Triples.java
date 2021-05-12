import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
        int tripple = 0;
        for (int j = 1; j < array.length - 1; j++) {
            if (array[j] == array[j - 1] + 1 && array[j] == array[j + 1] - 1) {
                tripple++;
            }
        }
        System.out.println(tripple);
    }
}
