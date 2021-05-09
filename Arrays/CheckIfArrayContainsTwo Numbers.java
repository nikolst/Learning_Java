import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        int size = input.nextInt();
        int[] array = new int[size];
        boolean flag = false;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
        int n = input.nextInt();
        int m = input.nextInt();
        
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == m && array[i] == n || array[i - 1] == n && array[i] == m) {
                flag = true;
                break;
            } 
        }
        
        if (flag) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
