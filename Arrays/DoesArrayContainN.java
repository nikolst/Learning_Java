import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();
        
        int[] array = new int[arrLength];
        
        //input the numbers of the array
        for (int i = 0; i < arrLength; i++) {
            array[i] = input.nextInt();
        }
        
        int checkNumber = input.nextInt();
        
        //check if the array contains the check_number
        boolean flag = false;
        
        for (int j = 0; j < arrLength; j++) {
            if (array[j] == checkNumber) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
